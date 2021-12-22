package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dao.CountryDAO;
import com.restapi.model.Countries;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryDAO countrydao;
	@Override
	public List<Countries> findAll(){
		List<Countries> listCountries = countrydao.findAll();
		return listCountries;
	}
	
	@Override
	public int delete(int id) {
		countrydao.delete(id);
		return id;
	}
	
	@Override
	public Countries getCountry(int id) {
		Countries country = countrydao.getCountry(id);
		return country;
	}
}
