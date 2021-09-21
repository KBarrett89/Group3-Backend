package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.security.persistence.repo.UserRepo;

@SpringBootApplication
public class SecurityTestingApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SecurityTestingApplication.class, args);
		System.out.println(ac.getBean(UserRepo.class).findAll());
	}

}