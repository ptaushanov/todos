package com.tu.base.services;

import com.tu.base.entities.Task;
import com.tu.base.entities.User;
import com.tu.base.exceptions.UserIsAlreadyExistException;
import com.tu.base.exceptions.UserNotFoundException;

import java.util.List;

public class UserService {

    public void register(List<User> userList, String username, String password) throws UserIsAlreadyExistException {

        if(userList.stream().noneMatch(u -> u.getUsername().equals(username))){
            userList.add(new User(username, password));
        }else{
            throw new UserIsAlreadyExistException();
        }
    }

    public User login(List<User> userList, String username, String password)throws UserNotFoundException {
        return userList.stream().filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst().orElseThrow(UserNotFoundException::new);
    }

    public List<Task> displayTasks(List<User> userList, String userName) throws UserNotFoundException {
        return userList.stream().filter(u -> u.getUsername().equals(userName))
                .findFirst().orElseThrow(UserNotFoundException::new).getTasks();
    }
}