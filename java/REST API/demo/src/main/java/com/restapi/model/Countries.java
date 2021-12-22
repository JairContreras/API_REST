package com.restapi.model;

import javax.persistence.*;

@Entity
@Table(name="Countries")
public class Countries {
	@Id
	@Column(name = "id_Country")
	Integer id_Country;
	@Column(name = "name")
	String name;
	@Column(name = "capital")
	String capital;
	@Column(name = "population")
	int population;
	@Column(name = "languageID")
	int languageId;
	public int getIdCountry() {
		return id_Country;
	}
	public void setIdCountry(int id_Country) {
		this.id_Country = id_Country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	
	
	
}
