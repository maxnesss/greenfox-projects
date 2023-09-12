package com.gfa.peer2peer.services;


import com.gfa.peer2peer.models.Input;
import com.gfa.peer2peer.models.Message;
import com.gfa.peer2peer.repositories.MessagesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    MessagesRepo messagesRepo;
    @Autowired
    public MessageService(MessagesRepo messagesRepo) {
        this.messagesRepo = messagesRepo;
    }

    public Input recieve(Input input){
        Message message = input.getMessage();
        input.setMessage(messagesRepo.save(message));
        return input;
    }
    public boolean messageExists(Input input){
        return messagesRepo.existsById(input.getMessage().getId());
    }
    public List<Message> getAll(){
        return messagesRepo.findAllByUsernameNotNullOrderByTimestampAsc();
    }

}
