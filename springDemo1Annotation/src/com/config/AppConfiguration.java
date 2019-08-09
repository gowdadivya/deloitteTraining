package com.config;

import org.springframework.context.annotation.*;

import com.Address;
import com.Customer;

@Configuration
public class AppConfiguration {
	
	@Bean
	//@Scope(value="prototype")
	public Customer getCustomerObject() {
		
		return new Customer();
	}
	
	@Bean
	public Address getAddressObject() {
		return new Address();
	}
	
	
	
	
}
