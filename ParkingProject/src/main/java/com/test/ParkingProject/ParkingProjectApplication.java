package com.test.ParkingProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingProjectApplication {


	@GetMapping("helo")
	public String helo(){
		return "Hello Word";
	}
	public static void main(String[] args) {
		SpringApplication.run(ParkingProjectApplication.class, args);
	}

}
