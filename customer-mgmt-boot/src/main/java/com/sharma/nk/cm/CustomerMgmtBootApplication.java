package com.sharma.nk.cm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.sharma.nk.cm.svcs.CustomerRepositoryImpl;
import com.sharma.nk.cm.svcs.CustomerRepositoryNoDbImpl;

@SpringBootApplication
public class CustomerMgmtBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMgmtBootApplication.class, args);
	}
	
	@Bean
	@Profile("nodb")
	public CustomerRepositoryNoDbImpl getCustomerRepositoryNoDbImpl() {
		return new CustomerRepositoryNoDbImpl();
	}
	
/*	@Bean
	@Profile("mysql")
	public CustomerRepositoryImpl getCustomerRepositoryImpl() {
		return new CustomerRepositoryImpl();
	}*/
}
