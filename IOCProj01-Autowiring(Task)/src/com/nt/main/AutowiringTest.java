package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.SeasonFinder;

public class AutowiringTest {
	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");
		
		//create IOC container
		@SuppressWarnings("rawtypes")
		Class c=AppConfig.class;
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(c);
		System.out.println("AutowiringTest::IOC Container creation completed");
		
		//get Target Spring bean class obj ref
		Class<SeasonFinder> seFi=SeasonFinder.class;
		
		//System.out.println(seFi.getName()+"....."+seFi.getSuperclass().getName()+"....."+seFi.getPackageName()+"......"+Arrays.toString(seFi.getDeclaredMethods()));
		
		SeasonFinder sf=ctx.getBean("sf", seFi);
		 System.out.println("Target spring bean class obj ref is gathered");	
		 
		//invoke b-method
		String msg=sf.seasonFinder("SaiRam");
		
		//Display Result
		System.out.println("Result is::"+msg);
		
		ctx.close();
		
		System.out.println("AutoWiring Test.main()--End");	
	}}