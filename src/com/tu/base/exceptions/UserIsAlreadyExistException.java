package com.tu.base.exceptions;

public class UserIsAlreadyExistException extends Exception{

    @Override
    public String getMessage() {
        return "User is already exist";
    }
}
