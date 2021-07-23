package com.tu.base;

import com.tu.base.entities.Task;
import com.tu.base.entities.User;
import com.tu.base.services.TaskService;
import com.tu.base.services.UserService;
import com.tu.ui.LoginWindow;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static UserService userService = new UserService(new ArrayList<User>());
    public static TaskService taskService = new TaskService(new ArrayList<Task>());

    public static void main(String[] args) {
        userService.getUserList().add(new User(1, "Ivan", "123"));
        userService.getUserList().add(new User(2, "Georgi", "456"));
        userService.getUserList().add(new User(3, "Todor", "789"));

        taskService.getTaskList().add(new Task(1, "Clean room", "More about cleaning rooms", "Low", 1));
        taskService.getTaskList().add(new Task(2, "Pick up trash", "Dump the trash in the bin", "High", 1));
        taskService.getTaskList().add(new Task(3, "Get a new car", "Save money for a new car", "Low", 1, Date.from(Instant.now())));


        LoginWindow loginWindow = new LoginWindow();

    }
}
