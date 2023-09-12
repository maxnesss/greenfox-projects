package com.example.newsletterbackend.controllers;

import com.example.newsletterbackend.models.User;
import com.example.newsletterbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    @CrossOrigin
    private ResponseEntity<?> signup(@RequestBody User user) {
    userService.saveUser(user);

    return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
