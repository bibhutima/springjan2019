package com.springboot.beginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from Spring Boot!!!");
		SpringApplication.run(SpringBootMainEntry.class, args);
		}

}