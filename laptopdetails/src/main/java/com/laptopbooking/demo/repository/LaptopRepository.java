package com.laptopbooking.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.laptopbooking.demo.entity.LaptopDetails;

public interface LaptopRepository extends JpaRepository<LaptopDetails,Integer>{

	
	//position parameter
	@Query("select l from LaptopDetails l where l.brandname=?1 and l.colour=?2")
	public List<LaptopDetails> getByBrandname(String brandname,String colour);
	
	//named parameter
	@Query("select l from LaptopDetails l where l.modelname=:modelname")
	public List<LaptopDetails> getByModelname(String modelname);
	

	//DML
	@Modifying
	@Query("delete from LaptopDetails l where l.brandname=?1")
	public int deleteByBrandname(String brandname);
	
	
	@Modifying
	@Query("update LaptopDetails l set l.modelname=?1 where l.modelid=?2")
	public int updateByModelname(String modelname,int modelid);
	
	
	@Query(value="select * from LaptopDetails l where l.brandname=?1",nativeQuery=true)
	public List<LaptopDetails> findByBrandname(String brandname);

	
	
	List<LaptopDetails> findByBrandnameStartingWith(String prefix);
	List<LaptopDetails> findByBrandnameEndingWith(String suffix);
	List<LaptopDetails> findByColour(String colour);
}
