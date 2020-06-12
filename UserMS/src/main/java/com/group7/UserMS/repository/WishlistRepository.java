package com.group7.UserMS.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group7.UserMS.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

}
