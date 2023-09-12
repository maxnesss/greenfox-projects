package com.gfa.peer2peer.models;

public class Client {
    private String id;

    public Client(String id) {
        this.id = id;
    }

    public Client() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
