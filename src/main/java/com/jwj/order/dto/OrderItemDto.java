package com.jwj.order.dto;

import com.jwj.order.domain.OrderItem;
import lombok.Data;

@Data
public class OrderItemDto {
	private Long id;
	private String itemName;
	private int orderPrice;
	private int count;
	private int totalPrice;

	public OrderItemDto(OrderItem orderItem) {
		this.id = orderItem.getId();
		this.itemName = orderItem.getItem().getName();
		this.orderPrice = orderItem.getOrderPrice();
		this.count = orderItem.getCount();
		this.totalPrice = orderItem.getTotalPrice();
	}
}