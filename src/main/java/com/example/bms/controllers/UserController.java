package com.example.bms.controllers;

import com.example.bms.dtos.LoginRequestDto;
import com.example.bms.dtos.LoginResponseDto;
import com.example.bms.dtos.ResponseStatus;
import com.example.bms.dtos.SignupUserResponseDTO;
import com.example.bms.dtos.SignupUserRequestDTO;
import com.example.bms.models.User;
import com.example.bms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignupUserResponseDTO signupUser(SignupUserRequestDTO requestDTO){
        SignupUserResponseDTO responseDTO = new SignupUserResponseDTO();
        try {
            User user = userService.signupUser(requestDTO.getName(), requestDTO.getEmail(), requestDTO.getPassword());
            responseDTO.setEmail(user.getEmail());
            responseDTO.setName(user.getName());
            responseDTO.setUserId(user.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }

    public LoginResponseDto login(LoginRequestDto requestDto){
        LoginResponseDto responseDto = new LoginResponseDto();
        try {
            boolean loggedIn = userService.login(requestDto.getEmail(), requestDto.getPassword());
            responseDto.setLoggedIn(loggedIn);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }

}