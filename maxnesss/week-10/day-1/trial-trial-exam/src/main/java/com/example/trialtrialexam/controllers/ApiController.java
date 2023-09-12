package com.example.trialtrialexam.controllers;

import com.example.trialtrialexam.models.Note;
import com.example.trialtrialexam.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/")
public class ApiController {
    private final NoteService noteService;
    @Autowired
    public ApiController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("note")
    public ResponseEntity<?> addPost(@RequestBody Note note){
        return ResponseEntity.ok(noteService.saveNote(note));
    }

    @GetMapping("notes")
    public ResponseEntity<?> listPosts(){
        return ResponseEntity.ok(noteService.listNotes());
    }
    @GetMapping("note")
    public ResponseEntity<?> getByType(@RequestParam String type){
        return ResponseEntity.ok(noteService.getByType(type));
    }
}
