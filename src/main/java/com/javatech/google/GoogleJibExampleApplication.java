package com.java.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleJibExampleApplication {
	@GetMapping("/message")
	public String message(){
		return "Deployment using Google Jib Spring App";
	}
	public static void main(String[] args) {
		SpringApplication.run(GoogleJibExampleApplication.class, args);
	}

}
