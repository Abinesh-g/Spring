package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
		"com.example.controller", "com.example.repository"})
@EnableJpaRepositories("com.example.repository")
@EntityScan( "com.example.model")
public class SpringFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
	}

}
