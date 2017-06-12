package com.samik.learning.springboot.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class LearningSpringbootApplication {

	public static void main(String[] args) {
		System.out.println("args = [" + args + "]");
		SpringApplication.run(LearningSpringbootApplication.class, args);
	}
}
