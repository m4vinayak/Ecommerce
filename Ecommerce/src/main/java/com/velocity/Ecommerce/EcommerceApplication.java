package com.velocity.Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(EcommerceApplication.class, args);
		System.out.println("End");
	}

}
