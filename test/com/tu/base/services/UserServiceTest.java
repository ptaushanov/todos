package com.tu.base.services;

import com.tu.base.entities.User;
import com.tu.base.exceptions.UserIsAlreadyExistException;
import com.tu.base.exceptions.UserNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        User[] users = new User[]{
                new User(1, "Ivan", "123"),
                new User(2, "Bojan", "321"),
                new User(3, "Denis", "213")
        };

        userService = new UserService(new ArrayList<>(Arrays.asList(users)));
    }

    @Test
    public void testRegister() throws UserIsAlreadyExistException {
        int size = userService.getUserList().size();

        userService.register(4, "Marko", "123");

        assertEquals(userService.getUserList().size(), size + 1);
    }

    @Test(expected = UserNotFoundException.class)
    public void testExceptionLogin() throws UserNotFoundException {

        userService.login("Delian", "111");
    }

    @Test
    public void testLogin() throws UserNotFoundException {
        assertEquals(userService.login("Ivan", "123").getUsername(), "Ivan");
    }


}