package com.group7.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group7.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> getByProductName(String category);
	
}
