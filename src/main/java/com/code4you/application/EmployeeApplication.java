package com.code4you.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
}
