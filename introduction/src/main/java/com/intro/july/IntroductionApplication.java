package com.intro.july;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IntroductionApplication {
	
	@GetMapping
	public String home() {
		return "________________starting introduction project....____________________";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

}
