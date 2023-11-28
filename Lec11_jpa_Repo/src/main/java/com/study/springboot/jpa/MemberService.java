	package com.study.springboot.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
//	public void insert() {
//		Member member;
//		
//		member = Member.builder().name("곽두팔").email("test1@test.com").build();
//		memberRepository.save(member);
//		member = Member.builder().name("김두팔").email("test1@test.com").build();
//		memberRepository.save(member);
//		member = Member.builder().name("박두팔").email("test1@test.com").build();
//		memberRepository.save(member);
//		member = Member.builder().name("갈두팔").email("test1@test.com").build();
//		memberRepository.save(member);
//	}
	
	public List<Member> selectAll() {
		return memberRepository.findAll();
	}
	
}
