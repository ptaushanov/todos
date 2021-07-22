package com.tu.base.exceptions;

public class TaskIsAlreadyExist extends Exception{

    @Override
    public String getMessage() {
        return "Task is already exist";
    }
}
