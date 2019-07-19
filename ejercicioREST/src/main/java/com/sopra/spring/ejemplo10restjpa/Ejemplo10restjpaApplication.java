package com.sopra.spring.ejemplo10restjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ejemplo10restjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo10restjpaApplication.class, args);
	}

}
