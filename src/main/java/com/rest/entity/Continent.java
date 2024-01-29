package com.rest.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Continent {
	
	@Id
	@Column(name = "CONTINENT_NAME")
	private String continent;
	
	@OneToMany(targetEntity = Country.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "continent")
	private List<Country> countries;
	public Continent() {}
	
	public Continent(String continent, List<Country> countries) {
		this.continent = continent;
		this.countries = countries;
	}

	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Continent [continent=" + continent + ", countries=" + countries + "]";
	}

	
	
	

}
