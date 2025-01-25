package com.sit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sit.config.AppConfig;
import com.sit.sbeans.CheckingVotingEligibility;


public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		System.out.println("AutoWiring Test.main()--Start");

		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		CheckingVotingEligibility voter=ctx.getBean("voter",CheckingVotingEligibility.class);
		
		String msg=voter.CheckEligibility();
		
		System.out.println("\n"+msg+"\n");
		
		ctx.close();
	}
}
