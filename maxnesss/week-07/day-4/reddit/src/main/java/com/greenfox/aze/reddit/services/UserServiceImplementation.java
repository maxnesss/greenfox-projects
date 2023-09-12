package com.greenfox.aze.reddit.services;

import com.greenfox.aze.reddit.exeptions.AppExeption;
import com.greenfox.aze.reddit.models.User;
import com.greenfox.aze.reddit.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImplementation implements UserService{

    UserRepo userRepo;
    @Autowired
    public UserServiceImplementation(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Iterable<User> getAll() {

        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> maybeUser = userRepo.findById(userId);
        if (maybeUser.isEmpty()) {
            throw new AppExeption("user doesn't exist", HttpStatus.BAD_REQUEST);
        }
        return maybeUser.get();
    }

    @Override
    public void addUser(User user) {
        try {
            userRepo.save(user);
        } catch (OptimisticLockingFailureException e){
            throw new AppExeption("user already exists", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public void removeUser(Long userId) {
        getUserById(userId);
        userRepo.deleteById(userId);
    }

    @Override
    public void editUser(Long userId, User user) {
        getUserById(userId).setName(user.getName());
    }
}

