package com.gfa.peer2peer.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Random;

@Entity
public class Message {
    @Id
    private Integer id = new Random().nextInt(8888888)+1000000;
    private String username;
    private String text;
    @CreationTimestamp
    private Timestamp timestamp;

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
