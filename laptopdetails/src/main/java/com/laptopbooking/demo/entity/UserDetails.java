package com.laptopbooking.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

	  @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int userid;
	    @Column(name="firstname")
		private String firstname;
	    @Column(name="lastname")
		private String lastname;
	    @Column(name="gender")
	    private String gender;
	    @Column(name="email")
	    private String email;
	    @Column(name="password")
	    private String password;
	    @Column(name="mobileno")
	    private long mobileno;
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
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getMobileno() {
			return mobileno;
		}
		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}
	    
}
