package com.greenfox.aze.reddit.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(nullable = false,unique = true)
    private String name;


    public User(String name) {
        this.name = name;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_id(Long userId) {
        this.user_id = userId;
    }

    public Long getUser_id() {
        return user_id;
    }
}
