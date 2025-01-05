//Dependent Class
package com.sit.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.sit.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.0-arg constructor");
	}
	
	@Bean(name="lt1")
	@Scope("singleton")
	@Lazy(true)
	public LocalTime createTime1() {
		System.out.println("AppConfig.createTime1()");
		return LocalTime.now();
	}
	

	@Bean(name="lt2")
	@Scope("singleton")
	@Lazy(true)
	public LocalTime createTime2() {
		System.out.println("AppConfig.createTime2()");
		return LocalTime.now();
	}
	
}
