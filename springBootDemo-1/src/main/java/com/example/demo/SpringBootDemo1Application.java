package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDemo1Application {

	@RequestMapping("/sayMessage")
	public String getMessage() {
		return "go go go go go";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

}
