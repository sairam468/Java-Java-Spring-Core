package com.sit.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ptr")
@Scope("prototype")
public class Printer {

	private static Printer INSTANCE;
	
	//Private Constructor
	private Printer() {
		System.out.println("Printer.Printer() constructor");
	}
	
	//static factory method having singleton logic
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE= new Printer();
		}
		return INSTANCE;
	}
	
	//b.Method
	public void PrintMsg(String msg) {
		System.out.println(msg);
	}
}
