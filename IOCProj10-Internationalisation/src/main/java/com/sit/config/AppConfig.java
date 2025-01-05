//Dependent Class
package com.sit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource")  //fixed Bean id
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("App");
		return source;
	}
}
