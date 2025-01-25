package com.sit.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sit.config.AppConfig;


public class App {
	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");

		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		//Read inputs from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Language code and Country code :");
		String lang=sc.next();
		String country=sc.next();
		
		//prepare Loacle obj having language and country codes
		@SuppressWarnings("deprecation")
		Locale locale=new Locale(lang,country);
		
		//read message from Locale specific properties file using ctx.getMessage()
		String msg1=ctx.getMessage("welcome.msg",new Object[]{"sai","ram"},locale);
		String msg2=ctx.getMessage("Goodbye.msg",new Object[]{"sai"},locale);
		String msg3=ctx.getMessage("application.title",new Object[]{},locale);
		String msg4=ctx.getMessage("wish.message",new Object[]{},locale);
		
		//diaplay the messages
		System.out.println(msg1+"....."+msg2+"....."+msg3+"....."+msg4);
		
		ctx.close();
	}
}
