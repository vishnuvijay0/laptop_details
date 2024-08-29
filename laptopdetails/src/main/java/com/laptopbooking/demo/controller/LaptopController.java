package com.laptopbooking.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptopbooking.demo.entity.LaptopDetails;
import com.laptopbooking.demo.service.LaptopService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class LaptopController {
    @Autowired
	LaptopService ls;
    @Tag(name="Get",description="getdata")
    @GetMapping("/lapdetail")
    public List<LaptopDetails> getLapDetails()
    {
    	return ls.getLapDetails();
    }
    @Tag(name="Post",description="postdata")
    @PostMapping("/save")
    public String saveDetails(@RequestBody LaptopDetails s)
    {
    	LaptopDetails lap= ls.saveDetails(s);
    	String result="false";
    	if(lap!=null)
    	{
    		result="true";
    	}
    	return result;
    }
    
    @PutMapping("/update")
    public LaptopDetails updateDetails(@RequestBody LaptopDetails r)
    {
    	return ls.updateDetails(r);
    }
    
    @DeleteMapping("/delete/{modelid}")
    public String deleteDetails(@PathVariable int modelid)
    {
    	ls.deleteDetails(modelid);
    	return "deleted";
    }
    
    //localhost:8080/lapdetail/?modelid=...
    @GetMapping("/lapdetail/")
    public LaptopDetails findLapById(@RequestParam int modelid)
    {
    	return ls.findLapById(modelid);
    }
    
    @GetMapping("/sortdetail")
    public List<LaptopDetails> sortLaptop(@RequestParam String field) 
    {
    	return ls.sortLaptop(field);
    }
    
    @GetMapping("/subsort")
    public List<LaptopDetails> subsort(@RequestParam String field1,@RequestParam String field2){
    	
    	return ls.subsort(field1,field2);
    }
    
    //List
    @GetMapping("/pageable")
    public List<LaptopDetails> pagingLaptop(@RequestParam int offset,@RequestParam int pagesize)
    {
    	return ls.pagingLaptop(offset,pagesize);
    }
    
    //page
    @GetMapping("/page")
    public Page<LaptopDetails> pagingLap(@RequestParam int offset,@RequestParam int pagesize)
    {
    	return ls.pagingLap(offset,pagesize);
    }
    
    @GetMapping("/pagesort")
    public List<LaptopDetails> pagesortLaptop(@RequestParam int offset,@RequestParam int pagesize,@RequestParam String field)
    {
    	return ls.pagesortLaptop(offset,pagesize,field);
    }
    
    @GetMapping("/brandnamestartwith")
    public List<LaptopDetails> getLapByBrandName(@RequestParam String prefix)
    {
    	return ls.getLapByBrandName(prefix);
    }
    
   
    @GetMapping("/brandnameendwith")
    public List<LaptopDetails> getByBrandName(@RequestParam String suffix)
    {
    	return ls.getByBrandName(suffix);
    }
    
    @GetMapping("/colour")
    public List<LaptopDetails> getByColour(@RequestParam String colour)
	{
		return ls.getByColour(colour);
	}
    @GetMapping("/getbybrand")
    public List<LaptopDetails> getByBrand(@RequestParam String brandname,@RequestParam String colour)
	{
		return ls.getByBrand(brandname,colour);
	}
	
    
    @GetMapping("/getlapbymodelname")
    public List<LaptopDetails> getModel(@RequestParam String modelname)
    {
    	return ls.getByModel(modelname);
    }
    
    @DeleteMapping("/deletelapbybrand")
    public String deletebrand(@RequestParam String brandname)
    {
    	int result= ls.deleteBrandName(brandname);
    	if(result>0)
    	{
    		return "Laptop detail deleted";
    	}
    	else
    	{
    		return "Problem occured while deleting";
    	}		
    }
    
    @PutMapping("/updateModelname/{modelname}/{modelid}")
	public String updateModelname(@PathVariable String modelname,@PathVariable int modelid)
	{
	     int result= ls.updateModelname(modelname, modelid);
	     if(result>0)
	     {
	    	 return "Updated Successfully";
	     }
	     else
	     {
	    	 return "Problem occured while updating";
	     }
	}
    
    @GetMapping("/findBrandName")
    public List<LaptopDetails> findBrandName(@RequestParam String brandname)
    {
    	return ls.findBrandname(brandname);
    }
}
