package com.laptopbooking.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.laptopbooking.demo.entity.LoginDetails;
import com.laptopbooking.demo.repository.LoginRepository;

@Service
public class LoginService {
    @Autowired
	LoginRepository lr;
    
    public List<LoginDetails> getDetails()
    {
    	return lr.findAll();
    }
    
    public LoginDetails saveLogin(LoginDetails l)
	{
		return lr.save(l);
	}
    
    public String loginCheckData(String firstname,String password)
    {
    	LoginDetails user=lr.findByFirstname(firstname);
    	if(user==null)
    	{
    		return "No user Found";
    	}
    	else
    	{
    		if(user.getPassword().equals(password))
    		{
    			return "Login Successful";
    		}
    		else
    		{
    			return "Login Failed";
    		}	
    	}
    	
    }
}
