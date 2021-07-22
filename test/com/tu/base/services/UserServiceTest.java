package com.tu.base.services;

import com.tu.base.entities.User;
import com.tu.base.exceptions.UserNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserServiceTest {

    private List<User> userList;

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        User[] users = new User[]{
                new User("Ivan", "123"),
                new User("Bojan", "321"),
                new User("Denis", "213")
        };

        userService = new UserService(Arrays.asList(users));
    }

    @Test
    public void testRegister() {

    }

    @Test(expected = UserNotFoundException.class)
    public void testExceptionLogin() throws UserNotFoundException {

        userService.login("Delian", "111");
    }

    @Test
    public void testLogin() throws UserNotFoundException {
        assertEquals(userService.login("Ivan", "123").getUsername(), "Ivan");
    }

    @Test
    public void testDisplayTasks() {
    }
}