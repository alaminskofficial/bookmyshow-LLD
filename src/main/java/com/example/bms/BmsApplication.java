package com.example.bms;

import com.example.bms.controllers.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.bms.dtos.*;

@SpringBootApplication
public class BmsApplication implements CommandLineRunner {
	@Autowired
	private UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(BmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// we can call any controller here to run those particular api
//		SignupUserRequestDTO signupRequestDto = new SignupUserRequestDTO();
//		signupRequestDto.setEmail("alamin@gmail.com");
//		signupRequestDto.setPassword("alamin123");
//
//		userController.signupUser(signupRequestDto);
		LoginRequestDto requestDto = new LoginRequestDto();
		requestDto.setEmail("alamin@gmail.com");
		requestDto.setPassword("alamin123");


		System.out.println("userController.login(\"alamin@gmail.com\", \"alamin123\") = "
				+ userController.login(requestDto).isLoggedIn());
	}
}
