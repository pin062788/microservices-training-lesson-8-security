package com.microservice.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EnrollServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrollServiceApplication.class, args);
	}
}
