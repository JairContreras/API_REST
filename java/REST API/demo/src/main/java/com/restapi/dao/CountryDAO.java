package com.restapi.dao;


import java.util.List;

import com.restapi.model.Countries;

public interface CountryDAO {
	
	List<Countries> findAll();
	
	int delete(int id);
	
	Countries getCountry(int id);
	
	Countries save(Countries country);
	

}
