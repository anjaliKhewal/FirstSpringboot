package com.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"hello"})
public class CourseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args);

	}

}
