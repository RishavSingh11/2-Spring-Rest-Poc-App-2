package com.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.Country;

@Repository
public interface CountryRepostiory extends JpaRepository<Country,String> {

	public Optional<Country> findByName(String name);
	public Country deleteCountryName();

	
}
