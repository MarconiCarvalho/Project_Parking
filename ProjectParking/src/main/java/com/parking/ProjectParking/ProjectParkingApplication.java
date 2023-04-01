package com.parking.ProjectParking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectParkingApplication {

	@GetMapping("/hello")
	public String index(){
		return "Olá Mundo!";
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectParkingApplication.class, args);
	}


}
