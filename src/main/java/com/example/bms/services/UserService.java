package com.example.bms.services;

import com.example.bms.models.User;

public interface UserService {

    public User signupUser(String name, String email, String password) throws Exception;

    public boolean login(String email, String password) throws Exception;
}
