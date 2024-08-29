package com.laptopbooking.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int userid;
	@Column(name="firstname")
	private String firstname;
	@Column(name="password")
	private String password;
	LoginDetails(){}
	
	

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
