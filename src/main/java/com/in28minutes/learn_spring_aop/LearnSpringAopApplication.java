package com.in28minutes.learn_spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learn_spring_aop.example.business.BusinessService1;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	private BusinessService1 businessService1;
	
	public LearnSpringAopApplication(BusinessService1 businessService1) {
		this.businessService1 = businessService1;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned is {}", businessService1.calculateMax());
		
	}

}
