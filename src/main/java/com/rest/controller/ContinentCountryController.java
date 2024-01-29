package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Continent;
import com.rest.entity.Country;
import com.rest.repository.ContinentRepository;
import com.rest.repository.CountryRepostiory;
import com.rest.request.CCRequest;

import ch.qos.logback.core.model.Model;
import jakarta.websocket.server.PathParam;

@RestController
public class ContinentCountryController {
	@Autowired
	private ContinentRepository continentRepository;
	
	@Autowired
	private CountryRepostiory  countryRepostiory;
	
	/*@PostMapping("/continet")
	public Continent postContinentCountry(@RequestBody CCRequest ccRequest) {
		return continentRepository.save(ccRequest.getContinet());
	}*/
	@PostMapping("/continet")
	public List<Continent> postContinentCountry(@RequestBody List<Continent> continet) {
		return continentRepository.saveAll(continet);
	}
	@GetMapping("/findAllContinet")
	public List<Continent> getContinentCountry() {
		return continentRepository.findAll();
	}
	@GetMapping("/findCountry/{name}")
	public Optional<Country> getCountry(@PathVariable String name) {
		return countryRepostiory.findByName(name);
		  
	}
	@GetMapping("/findContinent/{continent}")
	public Optional<Continent> getContinent(@PathVariable String continent) {
		return continentRepository.findByContinent(continent);
		  
	}
	@GetMapping("/findFlag")
	public Optional<String> getCountryFlag(@RequestParam String country) {
		Optional<Country> countryOpt = countryRepostiory.findByName(country);
		if(countryOpt.isPresent()) {
		return Optional.of(countryOpt.get().getFlag());
		}
		
		return Optional.of("Not Found");
		  
	}
	
	@PutMapping("/country/{name}")
	public Country updateCountryDtails(@RequestBody Country country) {
		return countryRepostiory.save(country);
	}
	@PutMapping("/continent/{continent}")
	public Continent updateCountryDtails(@RequestBody Continent continent) {
		return continentRepository.save(continent);
	}
	
}
