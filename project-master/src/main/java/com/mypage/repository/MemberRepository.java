package com.mypage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypage.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);

}