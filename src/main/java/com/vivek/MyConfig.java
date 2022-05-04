package com.vivek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.vivek")
public class MyConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver rv = new InternalResourceViewResolver();
		rv.setPrefix("/WEB-INF/");
		rv.setSuffix(".jsp");
		return rv;
	}
}
