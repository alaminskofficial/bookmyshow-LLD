package com.example.bms.exceptions;

public class UnAuthorizedAccessException extends Exception {
    public UnAuthorizedAccessException(String message) {
        super(message);
    }
}
