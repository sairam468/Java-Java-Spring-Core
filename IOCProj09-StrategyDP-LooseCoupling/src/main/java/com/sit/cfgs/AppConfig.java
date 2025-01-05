package com.sit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.sit.sbeans")
@ImportResource("applicationContext.xml")
public class AppConfig {

}
