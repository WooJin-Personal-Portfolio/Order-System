package com.jwj.order.controller;

import com.jwj.order.domain.Order;
import com.jwj.order.dto.OrderCanceledRequest;
import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.dto.OrderDto;
import com.jwj.order.rabbitmq.OrderPublisher;
import com.jwj.order.repository.OrderRepository;
import com.jwj.order.repository.OrderSearch;
import com.jwj.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderPublisher orderPublisher;
    private final OrderRepository orderRepository;

    // 주문 생성 REST API
    @PostMapping("/orders")
    public ResponseEntity<Long> order(@RequestBody OrderCreateRequest request) {

        // 주문 시 메시지를 발행
        orderPublisher.publishOrderCreatedEvent(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // 주문 필터링 조회 REST API
    @GetMapping("/orders")
    public ResponseEntity<List<OrderDto>> orderList(@RequestBody OrderSearch orderSearch) {
        // 엔티티 리스트 조회
        List<Order> orders = orderRepository.findOrders(orderSearch);

        // DTO로 변환
        List<OrderDto> result = orders.stream()
                .map(order -> new OrderDto(order))
                .collect(Collectors.toList());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    // 주문 취소 REST API
    @DeleteMapping("/orders/{orderId}/cancel")
    public ResponseEntity<Void> cancelOrder(@PathVariable("orderId") Long orderId) {

        // 주문 취소 DTO
        OrderCanceledRequest request = new OrderCanceledRequest(orderId);

        // 주문 취소 시 메시지를 발행
        orderPublisher.publishOrderCanceledEvent(request);

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}