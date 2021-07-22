package com.tu.base.services;

import com.tu.base.entities.Task;
import com.tu.base.entities.User;
import com.tu.base.exceptions.UserIsAlreadyExistException;
import com.tu.base.exceptions.UserNotFoundException;

import java.util.List;

public class UserService {

    private List<User> userList;

    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void register(String username, String password) throws UserIsAlreadyExistException {

        if(userList.stream().noneMatch(u -> u.getUsername().equals(username))){
            userList.add(new User(username, password));
        }else{
            throw new UserIsAlreadyExistException();
        }
    }

    public User login(String username, String password)throws UserNotFoundException {
        return userList.stream().filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst().orElseThrow(UserNotFoundException::new);
    }

    public List<Task> displayTasks(String userName) throws UserNotFoundException {
        return userList.stream().filter(u -> u.getUsername().equals(userName))
                .findFirst().orElseThrow(UserNotFoundException::new).getTasks();
    }
}