package dev.naman.repositories;

import dev.naman.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public User save(User user) {
        users.add(user);
        return user;
    }
}
