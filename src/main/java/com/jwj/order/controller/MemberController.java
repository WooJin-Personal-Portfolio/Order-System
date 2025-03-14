package com.jwj.order.controller;

import com.jwj.order.domain.Member;
import com.jwj.order.dto.MemberCreateRequest;
import com.jwj.order.dto.MemberListDTO;
import com.jwj.order.repository.MemberRepository;
import com.jwj.order.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    // 회원 생성 REST API
    @PostMapping("/members/new")
    public ResponseEntity<Void> create(@RequestBody MemberCreateRequest request) {

        memberService.join(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // 회원 목록 조회 REST API
    @GetMapping("/members")
    public ResponseEntity<List<Member>> list() {
        List<Member> members = memberRepository.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(members);
    }
}
