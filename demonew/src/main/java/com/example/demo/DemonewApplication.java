package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemonewApplication {

		public static void main(String[] args) {
			SpringApplication.run(DemonewApplication.class, args);
		}
		
		@GetMapping("/h")
		String data() {
			return "working";
		}

	}

