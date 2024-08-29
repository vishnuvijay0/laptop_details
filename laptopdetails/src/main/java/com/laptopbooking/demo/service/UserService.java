package com.laptopbooking.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptopbooking.demo.entity.UserDetails;
import com.laptopbooking.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	public List<UserDetails> getUserDetail()
	{
		return ur.findAll();
	}

	public UserDetails saveUserDetail(UserDetails u)
	{
		return ur.save(u);
	}
}
