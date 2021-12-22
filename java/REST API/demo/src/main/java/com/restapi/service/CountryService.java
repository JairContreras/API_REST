package com.restapi.service;

import java.util.List;

import com.restapi.model.Countries;

public interface CountryService {

	List<Countries> findAll();
	
	int delete(int id);
	
	Countries getCountry(int id);
	
}
