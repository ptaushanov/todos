package com.musala.todo.services.interfaces;

import com.musala.todo.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserByUsername(String username);
}
