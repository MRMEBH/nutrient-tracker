package com.nutrienttracker.nutrienttrackerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.nutrienttracker.nutrienttrackerbackend.model")
public class NutrientTrackerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutrientTrackerBackendApplication.class, args);
	}

}
