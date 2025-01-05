//WishMessgeGenerator.java(Target Class)

package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired  //Field Injection
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
