package dev.naman.services;

import dev.naman.models.User;
import dev.naman.repositories.UserRepository;

public class UserService {
    UserRepository userRepository = new UserRepository();

    public User createUser(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        return userRepository.save(user);
    }
}
