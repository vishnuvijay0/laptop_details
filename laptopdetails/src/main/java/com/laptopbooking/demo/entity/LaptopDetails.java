package com.laptopbooking.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LaptopDetails {
    @Id
	private int modelid;
    private String brandname;
    private String modelname;
    private String processor;
    private String ssd;
    private String ram;
    private String colour;
    private int price;
    private int rating; 
    private String warranty;
    
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="features")
    private Features feature;
    
    LaptopDetails()
    {}
    
    public Features getFeature() {
    	return feature;
    }
    
    public void setFeature(Features feature) {
    	this.feature = feature;
    }
    public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getSsd() {
		return ssd;
	}
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
