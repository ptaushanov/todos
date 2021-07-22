package com.musala.todo.services;

import com.musala.todo.entities.User;
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
}
