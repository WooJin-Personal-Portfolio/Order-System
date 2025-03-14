package com.jwj.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwj.order.dto.MemberCreateRequest;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @Builder
    private Member(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 정적 팩토리 메서드(DTO -> 엔티티)
    public static Member toEntity(MemberCreateRequest request) {
        return Member.builder()
                .name(request.getName())
                .address(request.getAddress())
                .build();
    }
}
