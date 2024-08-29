package com.laptopbooking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptopbooking.demo.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Integer>{
	
}
