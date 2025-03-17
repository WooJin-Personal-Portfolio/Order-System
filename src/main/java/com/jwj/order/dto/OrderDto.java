package com.jwj.order.dto;

import com.jwj.order.domain.Order;
import com.jwj.order.domain.OrderItem;
import com.jwj.order.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrderDto {
	private Long id;
	private String memberName;
	private LocalDateTime orderDate;
	private OrderStatus status;
	private List<OrderItemDto> orderItems;
	private String deliveryAddress;
	private String deliveryStatus;
	private int totalPrice;

	public OrderDto(Order order) {
		this.id = order.getId();
		this.memberName = order.getMember().getName();
		this.orderDate = order.getOrderDate();
		this.status = order.getStatus();
		this.totalPrice = order.getTotalPrice();

		this.orderItems = order.getOrderItems().stream()
				.map(OrderItemDto::new)
				.collect(Collectors.toList());

		if (order.getDelivery() != null) {
			if (order.getDelivery().getAddress() != null) {
				this.deliveryAddress = order.getDelivery().getAddress().toString();
			}
			this.deliveryStatus = order.getDelivery().getStatus().toString();
		}
	}
}