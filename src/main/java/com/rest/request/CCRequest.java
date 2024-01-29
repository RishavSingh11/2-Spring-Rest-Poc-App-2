package com.rest.request;

import java.util.List;

import com.rest.entity.Continent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CCRequest{
	
	private List<Continent> continents;
	
	//private Continent continet;
	
	
}
