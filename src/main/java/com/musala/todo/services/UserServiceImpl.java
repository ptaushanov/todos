package com.musala.todo.services;

import com.musala.todo.entities.User;
import com.musala.todo.exceptions.UserIsAlreadyExistException;
import com.musala.todo.repositories.UserRepository;
import com.musala.todo.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByUsername(String username) {

        return userRepository.getUserByUsername(username);
    }

    @Override
    public void registerUser(String username, String password) throws UserIsAlreadyExistException {
        if(userRepository.existsByUsername(username)){
            throw new UserIsAlreadyExistException();
        }else{
            userRepository.save(new User(username, password));
        }
    }
}
