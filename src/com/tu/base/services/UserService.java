package com.tu.base.services;

import com.tu.base.entities.User;
import com.tu.base.exceptions.UserIsAlreadyExistException;

import java.util.List;

public class UserService {

    public void register(List<User> userList, String username, String password) throws UserIsAlreadyExistException {

       if(userList.stream().noneMatch(u -> u.getUsername().equals(username))){
           userList.add(new User(username, password));
       }else{
           throw new UserIsAlreadyExistException();
       }
    }
}