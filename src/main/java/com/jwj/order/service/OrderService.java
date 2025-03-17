package com.jwj.order.service;

import com.jwj.order.domain.*;
import com.jwj.order.domain.Item;
import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.rabbitmq.LockRepository;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.repository.MemberRepository;
import com.jwj.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;
    private final LockRepository lockRepository;

    private static final int DEFAULT_LOCK_TIMEOUT = 5;

    // 주문 생성 비즈니스 로직
    @Transactional
    public Long order(Long memberId, OrderCreateRequest request) {
        return lockRepository.executeWithLock("order_" + memberId, DEFAULT_LOCK_TIMEOUT, () -> {
            //엔티티 조회
            Member member = memberRepository.findById(memberId)
                    .orElseThrow(() -> new IllegalArgumentException("회원을 찾을 수 없습니다: " + memberId));

            //주문상품 생성
            List<OrderItem> orderItemList = request.getOrderItems().stream()
                    .map(orderItemRequest -> {
                        Item item = itemRepository.findByIdWithPessimisticLock(orderItemRequest.getItemId())
                                .orElseThrow(() -> new IllegalArgumentException("상품을 찾을 수 없습니다: " + orderItemRequest.getItemId()));
                        // 재고 확인 로직 추가
                        if (item.getStockQuantity() < orderItemRequest.getCount()) {
                            throw new IllegalStateException("재고가 부족합니다: " + item.getName());
                        }
                        return OrderItem.createOrderItem(item, item.getPrice(), orderItemRequest.getCount());
                    })
                    .collect(Collectors.toList());

            //배송정보 생성
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            delivery.setStatus(DeliveryStatus.READY);

            //주문 생성
            Order order = Order.createOrder(member, delivery, orderItemList);

            //주문 저장
            orderRepository.save(order);

            return order.getId();
        });
    }

    // 주문 취소 비즈니스 로직
    @Transactional
    public void cancelOrder(Long orderId) {

        Order order = orderRepository.findById(orderId).orElse(null);
        order.cancel();
    }
}