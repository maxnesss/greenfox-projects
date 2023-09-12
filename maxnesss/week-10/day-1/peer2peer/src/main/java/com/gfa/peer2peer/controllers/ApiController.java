package com.gfa.peer2peer.controllers;

import com.gfa.peer2peer.models.Input;
import com.gfa.peer2peer.services.CommunicationService;
import com.gfa.peer2peer.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    MessageService messageService;
    CommunicationService communicationService;

    @Autowired
    public ApiController(MessageService messageService, CommunicationService communicationService) {
        this.messageService = messageService;
        this.communicationService = communicationService;
    }

    @PostMapping("/api/message/receive")
    public ResponseEntity<?> receive(@RequestBody Input input) {

        if(!messageService.messageExists(input)){
            Input output = messageService.recieve(input);
            communicationService.sendMessage(output);
        }

        Input output = messageService.recieve(input);// look closer TODO
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }

    @PostMapping("api/message/add")
    public ResponseEntity<?> addMessage(@RequestBody Input input) {
//        messageService.add(input);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("api/message")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(messageService.getAll());
    }
}
