//Dependent Class
package com.sit.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sit.sbeans.Printer;

@Configuration
@ComponentScan(basePackages="com.sit.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.0-arg constructor");
	}
	
	@Bean(name="lt1")
	@Scope("prototype")
	public LocalTime createTime1() {
		System.out.println("AppConfig.createTime1()");
		return LocalTime.now();
	}
	

	@Bean(name="lt2")
	@Scope("prototype")
	public LocalTime createTime2() {
		System.out.println("AppConfig.createTime2()");
		return LocalTime.now();
	}
	
	@Bean(name="print")
	@Scope("prototype")
	public Printer createPrinter() {
		System.out.println("AppConfig.createprinter()");
		return Printer.getInstance();
	}
	
}
