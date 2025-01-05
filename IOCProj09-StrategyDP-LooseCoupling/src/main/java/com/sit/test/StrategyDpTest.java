package com.sit.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sit.cfgs.AppConfig;
import com.sit.sbeans.flipKart;

public class StrategyDpTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		flipKart fk=ctx.getBean("fpkt",flipKart.class);
		
		String msg=fk.shopping(new String[] {"Shirt","Pant"}, new double[] {600.00,1200.25});
		
		System.out.println(msg);
		
	}

}
