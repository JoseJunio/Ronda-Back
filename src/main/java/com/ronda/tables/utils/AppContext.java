package com.ronda.tables.utils;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ronda.tables" })
public class AppContext {
	@Bean(name = "applicationProperty")
	public ApplicationProperty getApplicationProperty() {
		return new ApplicationProperty();
	}

//	@Bean(name = "passwordEncoder")
//	public StandardPasswordEncoder getStandardPasswordEncoder() {
//		return new StandardPasswordEncoder(getApplicationProperty().getSecret());
//	}
}