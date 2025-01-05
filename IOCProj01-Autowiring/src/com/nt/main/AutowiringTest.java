package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");
		
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AutowiringTest::IOC Container creation completed");
		
		//get Target Spring bean class obj ref
		WishMessageGenerator gen=ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Target spring bean class obj ref is gathered");
		
		//invoke b-method
		String msg=gen.generateMessage("SaiRam");
		
		//Display Result
		System.out.println("Result is::"+msg);
		
		ctx.close();
		
		System.out.println("AutoWiring Test.main()--End");
		
	}
}
