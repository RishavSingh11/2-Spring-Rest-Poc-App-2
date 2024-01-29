package com.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent,String> {

	public Optional<Continent> findByContinent(String continent);

	 
}
