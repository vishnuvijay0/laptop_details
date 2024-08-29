package com.laptopbooking.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.laptopbooking.demo.entity.LaptopDetails;
import com.laptopbooking.demo.repository.LaptopRepository;

import jakarta.transaction.Transactional;

@Service
public class LaptopService {
  
	@Autowired
	LaptopRepository lr;
	
	public List<LaptopDetails> getLapDetails()
	{
		return lr.findAll();
	}
	
	public LaptopDetails saveDetails(LaptopDetails s)
	{
		return lr.save(s);
	}

	public LaptopDetails updateDetails(LaptopDetails r)
	{
		
		return lr.save(r);
	}
	
	public void deleteDetails(int modelid)
	{
		 lr.deleteById(modelid);
	}
	
	public LaptopDetails findLapById(int modelid)
	{
		return lr.findById(modelid).orElse(null);
	}
	
	public List<LaptopDetails> sortLaptop(String field)
	{
		return lr.findAll(Sort.by(field));
	}
	
//	return lr.findAll(Sort.by(Direction.DESC, field));

	public List<LaptopDetails> subsort(String field1, String field2) {
		
		return lr.findAll(Sort.by(field1).and (Sort.by(field2)));
	}
	
	public List<LaptopDetails> pagingLaptop(int offset,int pagesize)
	{
		Page<LaptopDetails> paging=lr.findAll(PageRequest.of(offset, pagesize));
		
		return paging.getContent();
	}
	
	public Page<LaptopDetails> pagingLap(int offset,int pagesize)
	{
		Page<LaptopDetails> page=lr.findAll(PageRequest.of(offset, pagesize));
		
		return page;
	}
	
	public List<LaptopDetails> pagesortLaptop(int offset,int pagesize,String field)
	{
		Page<LaptopDetails> paging=lr.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
		
		return paging.getContent();
	}
	
	public List<LaptopDetails> getLapByBrandName(String prefix)
	{
		return lr.findByBrandnameStartingWith(prefix);
	}
	
	public List<LaptopDetails> getByBrandName(String suffix)
	{
		return lr.findByBrandnameEndingWith(suffix);
	}
	
	public List<LaptopDetails> getByColour(String colour)
	{
		return lr.findByColour(colour);
	}
	
	public List<LaptopDetails> getByBrand(String brandname,String colour)
	{
		return lr.getByBrandname(brandname,colour);
	}
	
	public List<LaptopDetails> getByModel(String modelname)
	{
		return lr.getByModelname(modelname);
	}
	
	@Transactional
	public int deleteBrandName(String brandname)
	{
		return lr.deleteByBrandname(brandname);
	}
	
	@Transactional
	public int updateModelname(String modelname,int modelid)
	{
		return lr.updateByModelname(modelname,modelid);
	}
	
	public List<LaptopDetails> findBrandname(String brandname)
	{
		return lr.findByBrandname(brandname);
	}
}
