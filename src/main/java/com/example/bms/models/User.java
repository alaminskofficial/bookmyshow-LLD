package com.example.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Data;


@Data
@Entity(name = "users")
public class User extends BaseModel{

    private String name;
    private String email;
    private String password;
    @Enumerated(value = jakarta.persistence.EnumType.ORDINAL)
    private UserType userType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
