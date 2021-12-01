package dev.naman.controllers;

import dev.naman.models.User;
import dev.naman.services.UserService;

public class UserController {
    private UserService userService = new UserService();

    public User createUser(String email, String password) {
        // waiter should only delegate to services
        // controllers should be as light as possible
        return userService.createUser(email, password);
    }
}
