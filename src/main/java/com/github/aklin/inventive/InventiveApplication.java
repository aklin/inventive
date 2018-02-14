package com.github.aklin.inventive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class InventiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventiveApplication.class, args);
	}
}
