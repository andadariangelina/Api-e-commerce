package com.example.ecommerce;

import com.example.ecommerce.config.ApiKeyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<ApiKeyFilter> apiKeyFilterRegistration() {
		FilterRegistrationBean<ApiKeyFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(apiKeyFilter());
		registration.addUrlPatterns("/*");
		return registration;
	}

	@Bean
	public ApiKeyFilter apiKeyFilter() {
		return new ApiKeyFilter();
	}
}
