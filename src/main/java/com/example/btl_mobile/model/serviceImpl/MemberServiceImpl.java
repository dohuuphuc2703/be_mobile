package com.example.btl_mobile.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.btl_mobile.model.entity.Member;
import com.example.btl_mobile.model.service.MemberService;
import com.example.btl_mobile.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public Member createMember(Member member) {
        return memberRepository.save(member);
    }
	@Override
	public Member updateMember(int id, Member member) {
		member.setId(id);
        return memberRepository.save(member);
    }
	@Override
	public boolean deleteMember(int id) {
        memberRepository.deleteById(id);
        return true;
    }
	@Override
	public Member getMemberById(int id) {
		return memberRepository.findById(id).orElse(null);
	}
	@Override
	public List<Member> getAllMember() {
        return memberRepository.findAll();
    }
	@Override
	public List<Member> searchMemberByFullName(String fullName) {
        return memberRepository.findByFullNameContaining(fullName);
    }
	
	
}
	