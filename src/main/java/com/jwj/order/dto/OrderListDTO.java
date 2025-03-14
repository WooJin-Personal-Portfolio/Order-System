package com.jwj.order.dto;

import com.jwj.order.domain.Order;
import com.jwj.order.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderListDTO {
	private Long id;
	private String memberName;
	private LocalDateTime orderDate;
	private OrderStatus status;
	private int totalPrice;
	private String deliveryAddress;
	private String deliveryStatus;

	public OrderListDTO(Order order) {
		this.id = order.getId();
		this.memberName = order.getMember().getName();
		this.orderDate = order.getOrderDate();
		this.status = order.getStatus();
		this.totalPrice = order.getTotalPrice();

		if (order.getDelivery() != null) {
			if (order.getDelivery().getAddress() != null) {
				this.deliveryAddress = order.getDelivery().getAddress().toString();
			}
			this.deliveryStatus = order.getDelivery().getStatus().toString();
		}
	}
}