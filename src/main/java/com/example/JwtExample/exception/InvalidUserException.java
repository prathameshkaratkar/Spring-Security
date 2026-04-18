package com.example.JwtExample.exception;

public class InvalidUserException  extends RuntimeException{

    public InvalidUserException(String msg) {
        super(msg);
    }

}
