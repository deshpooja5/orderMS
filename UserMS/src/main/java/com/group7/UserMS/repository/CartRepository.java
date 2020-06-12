package com.group7.UserMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group7.UserMS.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
