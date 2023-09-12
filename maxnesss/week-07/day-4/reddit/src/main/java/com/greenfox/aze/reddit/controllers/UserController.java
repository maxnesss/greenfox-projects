package com.greenfox.aze.reddit.controllers;

import com.greenfox.aze.reddit.models.User;
import com.greenfox.aze.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reddit/users/")
public class UserController {
    UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/")
    ResponseEntity<?> addUser(@RequestBody User user) {
    userService.addUser(user);
    return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/")
    ResponseEntity<?> allUsers() {
    return ResponseEntity.status(HttpStatus.OK).body(userService.getAll());
    }
    @DeleteMapping("/{id}")
    void removeUser(@PathVariable Long id){
    userService.removeUser(id);
    }
    @PutMapping("/{id}")
    void editUser(@PathVariable Long id,@RequestBody User user) {
    userService.editUser(id,user);
    }

}
