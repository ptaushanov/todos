package com.musala.todo.exceptions;

public class UserNotFoundException extends Exception{

    @Override
    public String getMessage(){

        return "User hasn't founded";

    }
}
