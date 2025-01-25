package com.sit.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
@Lazy(true)
public class WishMessageGenerator {
	@Autowired  //Field Injection
	@Qualifier("lt1")
	private LocalTime lt; //HAS-Property(Composition)

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator ::0-Arg constructor");
	}
	
	//business Method
	public String generateMessage(String user) {
		//get Current hour of the day
		int hour=lt.getHour(); 
		
		//generate the wish message
		if(hour<12)return "Good Morning::"+user;
		else if(hour<16)return "Good Afternoon::"+user;
		else if(hour<20)return "Good Evening::"+user;
		else return "Good night::"+user;
	}
}
