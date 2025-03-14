package com.jwj.order.service;

import com.jwj.order.domain.Member;
import com.jwj.order.dto.MemberCreateRequest;
import com.jwj.order.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    // 회원 가입
    @Transactional
    public Long join(MemberCreateRequest request) {

        validateDuplicateMember(request);

        Member member = Member.builder()
                .name(request.getName())
                .address(request.getAddress())
                .build();

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(MemberCreateRequest request) {
        String name = request.getName();
        List<Member> findMembers = memberRepository.findByName(name);
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}
