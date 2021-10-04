package com.tu.base.exceptions;

public class TaskNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "Task not found";
    }
}
