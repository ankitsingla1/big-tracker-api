package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class BugTrackerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerServiceApplication.class, args);
	}

}
