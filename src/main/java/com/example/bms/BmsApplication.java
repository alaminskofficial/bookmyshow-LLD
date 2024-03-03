package com.example.bms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// we can call any controller here to run those particular api
	}
}
