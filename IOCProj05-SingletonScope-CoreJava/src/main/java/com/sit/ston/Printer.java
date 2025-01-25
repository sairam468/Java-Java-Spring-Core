package com.sit.ston;

public class Printer {

	private static Printer INSTANCE;
	
	//Private Constructor
	private Printer() {
		System.out.println("Printer.Printer() constructor");
	}
	
	//ststic factory method having singleton logic
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
