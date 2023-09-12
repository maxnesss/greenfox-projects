package com.example.trialtrialexam.services;

import com.example.trialtrialexam.models.Note;
import com.example.trialtrialexam.models.NoteSendDTO;
import com.example.trialtrialexam.models.NoteTypeDTO;
import com.example.trialtrialexam.repositories.NoteRepo;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    private final NoteRepo noteRepo;
    @Autowired
    public NoteService(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }



    public Note saveNote(Note note){
        return noteRepo.save(note);
    }
    public List<NoteSendDTO> listNotes(){
        List<Note> notes = noteRepo.findAll();
        List<NoteSendDTO> noteSendDTOS  = new ArrayList<>();
        notes.stream().forEach(el ->{
            NoteSendDTO noteSendDTO = new NoteSendDTO(el);
            noteSendDTOS.add(noteSendDTO);
        });

        return noteSendDTOS;
    }

    public List<NoteTypeDTO> getByType(String type) {
        List<Note> notes = noteRepo.getAllByType(type);
        List<NoteTypeDTO> noteTypeDTOS  = new ArrayList<>();
        notes.stream().forEach(el ->{
            NoteTypeDTO noteTypeDTO = new NoteTypeDTO(el);
            noteTypeDTOS.add(noteTypeDTO);
        });


        return noteTypeDTOS;

    }
}
