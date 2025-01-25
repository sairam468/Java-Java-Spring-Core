package com.sit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sit.config.AppConfig;
import com.sit.sbeans.Printer;
import com.sit.sbeans.WishMessageGenerator;


public class App {
	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");
		
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AutowiringTest::IOC Container creation completed");
		
		System.out.println("----------------------------------------------");
		WishMessageGenerator gen1=ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator gen2=ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator gen3=ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(gen1.hashCode()+"..."+(gen2.hashCode())+"..."+(gen3.hashCode()));
		System.out.println(gen1==gen2);
		System.out.println(gen3==gen2);
		

		System.out.println("----------------------------------------------");
		Printer p1=ctx.getBean("ptr", Printer.class);
		Printer p2=ctx.getBean("ptr", Printer.class);
		
		
		System.out.println(p1.hashCode()+"..."+(p2.hashCode()));
		System.out.println(p1==p2);
	
		System.out.println("----------------------------------------------");
		Printer p11=ctx.getBean("print", Printer.class);
		Printer p12=ctx.getBean("print", Printer.class);
		
		
		System.out.println(p11.hashCode()+"..."+(p12.hashCode()));
		System.out.println(p11==p12);
		
		ctx.close();
	}
}
