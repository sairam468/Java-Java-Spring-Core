package com.sit.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("App.properties")
public class CheckingVotingEligibility {

	@Value("${voter.id}")
	private String id;

	@Value("${voter.name}")
	private String name;

	@Value("${voter.age}")
	private Integer age;

	private Date verifiedOn;

	public CheckingVotingEligibility() {
		System.out.println("CheckingVotingEligibility.CheckingVotingEligibility()");
	}

	@PostConstruct //init life cycle methods
	public void myInit() throws IllegalAccessException {
		System.out.println("CheckingVotingEligibility.myInit()");

		//initialize the left over properties that is no part of injection
		verifiedOn=new Date();

		//validating logic
		if(age>=0 && name==null)
			throw new IllegalAccessException("Set Correct values to name and age properties");

	}
	//b.method
	public String CheckEligibility() {
		System.out.println("CheckingVotingEligibility.myInit()");
		if(age>=18)
			return "Mr/Miss/Mrs "+name+" is eligible for voting --> verified on "+verifiedOn;
		else
			return "Mr/Miss/Mrs "+name+" is eligible for voting --> verified on "+verifiedOn;
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("CheckingVotingEligibility.myDestroy()");
		name=null;
		age=null;
		verifiedOn=null;
		id=null;
	}

}
