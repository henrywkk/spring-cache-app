package com.example.springcacheapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCaching
public class SpringCacheAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheAppApplication.class, args);
	}

}
