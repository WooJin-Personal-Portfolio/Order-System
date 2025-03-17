package com.jwj.order.rabbitmq;

import com.jwj.order.dto.OrderCreateRequest;
import com.jwj.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.jwj.order.rabbitmq.RabbitMqConfig.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderConsumer {

	private final OrderService orderService;
	private final RabbitTemplate rabbitTemplate;

	// [2] 컨슈머가 큐로부터 경쟁 소비자 패턴을 적용해 메시지를 소비
	@RabbitListener(queues = ORDER_QUEUE)
	@Transactional
	public void consumeOrderCreatedEvent(OrderCreateRequest request) {
		try {
			String threadName = Thread.currentThread().getName();	// 병렬 쓰레드로 처리가 되는가?
			log.info("주문 이벤트 수신 완료: {}, 처리 스레드: {}", request, threadName);

			log.info("주문 이벤트 수신 완료: {}", request);
			orderService.order(request.getMemberId(), request);
			log.info("주문이 성공적으로 완료되었습니다!");
		} catch (Exception e) {
			log.error("주문에 실패했습니다! 오류: {}", e.getMessage(), e);

			// 실패한 주문 메시지를 DLQ로 보낸다.
			rabbitTemplate.convertAndSend(
					DEADLETTER_EXCHANGE,
					DEADLETTER_ROUTING_KEY,
					request
			);
			throw e;
		}
	}

	@RabbitListener(queues = DEADLETTER_QUEUE, concurrency = "10")
	@Transactional
	public void consumeFailedMessage(OrderCreateRequest request) throws InterruptedException {
		try {
			log.info("DLQ 메시지 처리 중: {}", request);

			// 재처리를 위해 원래 큐로 다시 전송
			rabbitTemplate.convertAndSend(
					ORDER_EXCHANGE,
					ORDER_ROUTING_KEY,
					request
			);

			log.info("DLQ 메시지를 원래 큐로 다시 전송했습니다: {}", request.getMemberId());
		} catch (Exception e) {
			log.error("DLQ 메시지 처리 실패: {}", e.getMessage(), e);

			// 실패한 메시지 재시도를 위해 다시 DLQ 큐로 보내기
			rabbitTemplate.convertAndSend(
					DEADLETTER_EXCHANGE,
					DEADLETTER_ROUTING_KEY,
					request
			);
			throw e;
		}
	}
}