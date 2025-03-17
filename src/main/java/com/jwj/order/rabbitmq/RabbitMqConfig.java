package com.jwj.order.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

	public static final String ORDER_EXCHANGE = "ORDER_EXCHANGE";			// 주문 익스체인지
	public static final String ORDER_QUEUE = "ORDER_QUEUE";					// 주문 대기열
	public static final String ORDER_ROUTING_KEY = "ORDER_CREATED";			// 주문 라우팅 키

	public static final String DEADLETTER_EXCHANGE = "DEAD_LETTER_EXCHANGE";
	public static final String DEADLETTER_QUEUE = "DEAD_LETTER_QUEUE";
	public static final String DEADLETTER_ROUTING_KEY = "DEAD_LETTER";

	// Message Converter
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	// RabbitTemplate
	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;
	}

	// MessageListenerAdapter
	@Bean
	public MessageListenerAdapter messageListenerAdapter(OrderConsumer consumer) {
		MessageListenerAdapter messageListenerAdapter = new MessageListenerAdapter(consumer);
		messageListenerAdapter.setMessageConverter(messageConverter());
		return messageListenerAdapter;
	}

	// SimpleMessageListenerContainer
	@Bean
	public SimpleMessageListenerContainer simpleMessageListenerContainer(ConnectionFactory connectionFactory) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(ORDER_QUEUE);

		container.setConcurrentConsumers(10);				// 병렬 쓰레드 개수
		container.setPrefetchCount(20);						// 프리패치 카운트 최적화 요소
		container.setAcknowledgeMode(AcknowledgeMode.AUTO);	// ACK 모드 활성화
		return container;
	}

	// DLX(DeadLetterExchange)
	@Bean
	public DirectExchange deadLetterExchange() {
		return new DirectExchange(DEADLETTER_EXCHANGE);
	}

	// DLQ(DeadLetterQueue)
	@Bean
	public Queue deadLetterQueue() {
		return QueueBuilder.durable(DEADLETTER_QUEUE)
				.build();
	}

	// DLQ와 DLX 연결
	@Bean
	public Binding deadLetterBinding() {
		return BindingBuilder.bind(deadLetterQueue())
				.to(deadLetterExchange())
				.with(DEADLETTER_ROUTING_KEY);
	}

	// 주문 Exchange
	@Bean
	public TopicExchange orderExchange() {
		return new TopicExchange(ORDER_EXCHANGE);
	}

	// 주문 Queue - 동시 처리 요청 제한
	@Bean
	public Queue orderQueue() {
		return QueueBuilder.durable(ORDER_QUEUE)
				.withArgument("x-dead-letter-exchange", DEADLETTER_EXCHANGE)
				.withArgument("x-dead-letter-routing-key", DEADLETTER_ROUTING_KEY)
				.build();
	}

	// 주문 Binding
	@Bean
	public Binding orderBinding() {
		return BindingBuilder.bind(orderQueue())
				.to(orderExchange())
				.with(ORDER_ROUTING_KEY);
	}
}