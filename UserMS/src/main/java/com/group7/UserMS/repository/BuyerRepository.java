package com.group7.UserMS.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group7.UserMS.dto.BuyerDTO;
import com.group7.UserMS.entity.Buyer;

@Repository
@Transactional
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

	public Buyer findByBuyerId(int Id);
	public Buyer findByEmail(String emailId);
	public Buyer findByPhoneNumber(String phoneNumber);
	public void save(BuyerDTO buyer);
}
