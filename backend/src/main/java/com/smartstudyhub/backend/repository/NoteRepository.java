package com.smartstudyhub.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartstudyhub.backend.model.*;

interface NoteRepository extends JpaRepository<Note, Long> {

    
}