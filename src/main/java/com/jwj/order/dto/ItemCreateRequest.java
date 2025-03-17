package com.jwj.order.dto;

import com.jwj.order.domain.Item;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCreateRequest {

	private String name;
	private int price;
	private int stockQuantity;

	public static ItemCreateRequest toDto(Item item) {
		return ItemCreateRequest.builder()
                .name(item.getName())
                .price(item.getPrice())
                .stockQuantity(item.getStockQuantity())
                .build();
	}
}
