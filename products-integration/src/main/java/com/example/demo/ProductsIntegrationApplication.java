package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("spring-integration.xml")
public class ProductsIntegrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductsIntegrationApplication.class, args);
	}
}