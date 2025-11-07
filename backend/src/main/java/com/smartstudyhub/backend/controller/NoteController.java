package com.smartstudyhub.backend.controller;

import com.smartstudyhub.backend.model.Note;
import com.smartstudyhub.backend.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

@RequestMapping("/api/notes")
public class NoteController {
    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<Note> getAllNotes() {

        return noteRepository.findAll(); 
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return noteRepository.save(note);
    }
}
