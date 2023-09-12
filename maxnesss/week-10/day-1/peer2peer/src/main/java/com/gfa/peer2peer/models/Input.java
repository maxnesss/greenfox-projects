package com.gfa.peer2peer.models;

public class Input {
    private Message message;
    private Client client;

    public Input(Message message, Client client) {
        this.message = message;
        this.client = client;
    }

    public Input() {
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
