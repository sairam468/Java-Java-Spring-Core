package com.sit.test;

import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sit.config.AppConfig;
import com.sit.sbeans.WishMessageGenerator;


public class App {
	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");
		
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AutowiringTest::IOC Container creation completed");
//		
//		//get Target Spring bean class obj ref
//		WishMessageGenerator gen=ctx.getBean("wmg", WishMessageGenerator.class);
//		System.out.println("Target spring bean class obj ref is gathered");
//		
//		//invoke b-method
//		String msg=gen.generateMessage("SaiRam");
//		
//		//Display Result
//		System.out.println("Result is::"+msg);
		
		
		//System.out.println("AutoWiring Test.main()--End");
		
//		System.out.println("----------------------------------------------");
//		System.out.println("All bean ids Count: "+ctx.getBeanDefinitionCount());
//		System.out.println("All bean ids: "+Arrays.toString(ctx.getBeanDefinitionNames()));

		
		System.out.println("----------------------------------------------");
		WishMessageGenerator gen1=ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator gen2=ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator gen3=ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(gen1.hashCode()+"..."+(gen2.hashCode())+"..."+(gen3.hashCode()));
		System.out.println(gen1==gen2);
		System.out.println(gen3==gen2);
		
		
		System.out.println("----------------------------------------------");
		LocalTime lt11=ctx.getBean("lt1",LocalTime.class);
		LocalTime lt12=ctx.getBean("lt1",LocalTime.class);
		
		System.out.println(lt11.hashCode()+"..."+lt12.hashCode());
		
		System.out.println("----------------------------------------------");
		LocalTime lt21=ctx.getBean("lt2",LocalTime.class);
		LocalTime lt22=ctx.getBean("lt2",LocalTime.class);
		
		System.out.println(lt21.hashCode()+"..."+lt22.hashCode());
		
		
		ctx.close();
	}
}
