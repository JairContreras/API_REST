package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.restapi.dao.CountryDAO;
import com.restapi.model.Countries;

@RestController
@RequestMapping("/api")
public class Controller{

	@Autowired
	private CountryDAO countryDAO;
	
	 @GetMapping("/countries")
	    public List<Countries> getAll(){
	        return countryDAO.findAll();
	    }
	 
	 @GetMapping("countries/{id}")
	 public Countries getCountry(@PathVariable("id") Integer id) {
		 return countryDAO.getCountry(id);
	 }
	 
	 @DeleteMapping("countries/{id}")
	 public String deleteCountry(@PathVariable("id") Integer id) {
		 Countries country = countryDAO.getCountry(id);
		 if(country == null) {
			 throw new RuntimeException("Country not found");
		 }
		 countryDAO.delete(id);
		 return "country deleted";
	 }
	 
	 @PostMapping("/country")
	 public Countries saveCountry(@RequestBody Countries Country) {
		 return countryDAO.save(Country);
	 }

	 

}
