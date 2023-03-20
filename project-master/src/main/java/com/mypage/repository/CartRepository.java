package com.mypage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypage.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByMemberId(Long memberId);

}