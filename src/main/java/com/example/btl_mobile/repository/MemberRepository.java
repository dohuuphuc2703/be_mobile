package com.example.btl_mobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.btl_mobile.model.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	List<Member> findByFullNameContaining(String fullName);
}
