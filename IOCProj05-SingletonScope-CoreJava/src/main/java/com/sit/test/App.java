package com.sit.test;

import com.sit.ston.Printer;

public class App {
    public static void main(String[] args) {
      Printer p1=Printer.getInstance();
      Printer p2=Printer.getInstance();
      
      System.out.println(p1.hashCode());
      System.out.println(p2.hashCode());
      
      System.out.println(p1==p2);
    	
    	
    }
}
