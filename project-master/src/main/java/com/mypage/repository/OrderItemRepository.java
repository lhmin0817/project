package com.mypage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypage.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}