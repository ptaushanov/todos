package com.musala.todo.services.interfaces;

import com.musala.todo.entities.User;
import com.musala.todo.exceptions.UserIsAlreadyExistException;
import com.musala.todo.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void registerUser(String username, String password) throws UserIsAlreadyExistException;

    User getUserByUsername(String username);

    User loginUser(String username, String password) throws UserNotFoundException;
}
