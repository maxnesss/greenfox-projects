package com.example.trialtrialexam.repositories;

import com.example.trialtrialexam.models.Note;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepo extends ListCrudRepository<Note,Long> {
    List<Note> getAllByType(String type);
}
