package com.study.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService
{
    @Autowired
    private MemberRepository memberRepository;

    public Member insert(Member member) 
    {
    	Member returnMember = memberRepository.save(member);
    	return returnMember;
    }

    public Optional<Member> select(Long id) 
    {
        Optional<Member> member = memberRepository.findById(id);
        return member;
    }

    public List<Member> selectAll() 
    {
        return memberRepository.findAll();
    }

    public void delete(Long id) 
    {
        memberRepository.deleteById(id);
				//호출은 해당 ID의 레코드를 삭제하는 작업을 수행하며, 리턴 값이 없는 것이 일반적입니다. 
				//이는 삭제 작업이 성공적으로 수행되면 따로 반환할 필요가 없기 때문입니다.
    }
    
    public Member update(Member member) {
    	Member returnMember = memberRepository.save(member);
    	return returnMember;
    }
   
}