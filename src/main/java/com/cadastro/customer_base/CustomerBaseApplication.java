package com.cadastro.customer_base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cadastro")
public class CustomerBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerBaseApplication.class, args);
	}

}
