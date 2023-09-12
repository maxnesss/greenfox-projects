package com.example.newsletterbackend.services;

import com.example.newsletterbackend.models.User;
import com.example.newsletterbackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user){
        userRepo.save(user);
    }
}
