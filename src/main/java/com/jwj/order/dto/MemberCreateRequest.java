package com.jwj.order.dto;

import com.jwj.order.domain.Address;
import com.jwj.order.domain.Member;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberCreateRequest {

	private String name;
	private Address address;

	// 정적 팩토리 메서드(엔티티 -> DTO)
	public static MemberCreateRequest toDto(Member member) {
		return MemberCreateRequest.builder()
				.name(member.getName())
				.address(member.getAddress())
				.build();
	}
}
