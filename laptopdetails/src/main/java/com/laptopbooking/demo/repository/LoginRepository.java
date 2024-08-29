package com.laptopbooking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptopbooking.demo.entity.LoginDetails;

public interface LoginRepository extends JpaRepository<LoginDetails,Integer>{

	LoginDetails findByFirstname(String firstname);
}
