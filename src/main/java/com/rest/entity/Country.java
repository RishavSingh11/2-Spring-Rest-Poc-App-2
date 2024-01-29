package com.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
	
	@Id
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "FLAG")
	private String flag;
	
	public Country() {}

	public Country(String name, String flag) {
		this.name = name;
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	


	
	@Override
	public String toString() {
		return "Country [name=" + name + ", flag=" + flag+"]";
	}

	
	
}
