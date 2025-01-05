package com.sit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.sit.config.AppConfig;
import com.sit.sbeans.PersonalInfo;


public class App {
	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");

		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		PersonalInfo pi=ctx.getBean("pinfo",PersonalInfo.class);

		Environment env=ctx.getEnvironment();
		System.out.println("Os name :: "+env.getProperty("os.name"));

		System.out.println(pi);

		ctx.close();
	}
}
