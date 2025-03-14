package com.jwj.order.service;

import com.jwj.order.domain.*;
import com.jwj.order.domain.Item;
import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.repository.ItemRepository;
import com.jwj.order.repository.MemberRepository;
import com.jwj.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    // 주문 생성 비즈니스 로직
    @Transactional
    public Long order(Long memberId, OrderCreateRequest request) {

        //엔티티 조회
        Member member = memberRepository.findById(memberId).orElse(null);

        //주문상품 생성
        List<OrderItem> orderItemList = request.getOrderItems().stream()
                .map(orderItemRequest -> {
                    Item item = itemRepository.findById(orderItemRequest.getItemId()).orElse(null);
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
    }

    // 주문 취소 비즈니스 로직
    @Transactional
    public void cancelOrder(Long orderId) {

        Order order = orderRepository.findById(orderId).orElse(null);
        order.cancel();
    }
}
