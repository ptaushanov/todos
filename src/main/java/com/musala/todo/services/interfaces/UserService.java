package com.musala.todo.services.interfaces;

import com.musala.todo.entities.User;
import com.musala.todo.exceptions.UserIsAlreadyExistException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void registerUser(String username, String password) throws UserIsAlreadyExistException;

    User getUserByUsername(String username);
}
