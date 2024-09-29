package com.edureka.purdue_sept2024__ci_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PurdueSept2024CiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurdueSept2024CiDemoApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
      return String.format("<h1>Hello There!!!, welcome to my project</h1>");
    }
}
