package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate ld;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder::0-Arg constructor");
	}
	
	//b-Method
	public String seasonFinder(String user) {
		int month=ld.getMonthValue();
		if(month>=3 && month<=6)
			return "Hello "+user+" It's Summer season";
		else if(month>=7 && month<=10)
			return "Hello "+user+" It's Rainy season";
		else
			return "Hello "+user+" It's Winter Season";
}}
