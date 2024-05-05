package com.example.btl_mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile.model.entity.Member;
import com.example.btl_mobile.model.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
    private MemberService memberService;
	
	@PostMapping
    public Member createUser(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping
    public List<Member> getAllMember() {
        return memberService.getAllMember();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable int id) {
        return memberService.getMemberById(id);
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable int id, @RequestBody Member member) {
        return memberService.updateMember(id, member);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMember(@PathVariable int id) {
    	return memberService.deleteMember(id);
    }
    
    @GetMapping("/searchMember")
    public List<Member> searchMemberByFullName(@RequestParam("fullName") String fullName) {
        return memberService.searchMemberByFullName(fullName);
    }
}
