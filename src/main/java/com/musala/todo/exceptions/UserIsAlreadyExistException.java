package com.musala.todo.exceptions;

public class UserIsAlreadyExistException extends Exception{

    @Override
    public String getMessage(){

        return "User is already exist";

    }
}
