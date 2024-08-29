package com.laptopbooking.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptopbooking.demo.entity.LoginDetails;
import com.laptopbooking.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService ls;
	
	@GetMapping("/getlogin")
	public List<LoginDetails> getDetails()
	{
		return ls.getDetails();
	}
	@PostMapping("/checkLogin")
	public String LoginDetails(@RequestBody LoginDetails l)
	{
	    System.out.println(l.getFirstname());
		return ls.loginCheckData(l.getFirstname(),l.getPassword());
	}

	@PostMapping("/addLogin")
	public LoginDetails saveLogin(@RequestBody LoginDetails l)
	{
		return ls.saveLogin(l);
	}


	
}
