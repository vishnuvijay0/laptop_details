package com.laptopbooking.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Features {
	
	@Id
	@GeneratedValue
	private int fid;
	private String screensize;
	private String backlight;
	private String weight;
	private String fingerprint;
	Features(){}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getScreensize() {
		return screensize;
	}
	public void setScreensize(String screensize) {
		this.screensize = screensize;
	}
	public String getBacklight() {
		return backlight;
	}
	public void setBacklight(String backlight) {
		this.backlight = backlight;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	
}
