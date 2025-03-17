package com.jwj.order.rabbitmq;

import com.jwj.order.dto.OrderCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static com.jwj.order.rabbitmq.RabbitMqConfig.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderPublisher {

	private final RabbitTemplate rabbitTemplate;

	// [1] 주문 요청을 메시지 큐로 발행
	public void publishOrderCreatedEvent(OrderCreateRequest request) {
		try {
			log.info("주문 생성 이벤트 발행: {}", request);
			rabbitTemplate.convertAndSend(ORDER_EXCHANGE, ORDER_ROUTING_KEY, request);
		} catch (Exception e) {
			log.error("주문 생성 이벤트 발행 실패: {}", e.getMessage());
			throw new RuntimeException("주문 메시지 발행 실패", e);
		}
	}
}
