package com.greenfox.aze.reddit.services;

import com.greenfox.aze.reddit.models.User;

public interface UserService {
    Iterable<User> getAll();
    User getUserById(Long userId);
    void addUser(User user);
    void removeUser(Long userId);
    void editUser(Long userId, User user);
}
