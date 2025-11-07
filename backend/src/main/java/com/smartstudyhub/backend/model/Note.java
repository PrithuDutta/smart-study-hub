package com.smartstudyhub.backend.model;

import jakarta.persistence.*;
import lombok.Data; 

@Entity
@Table(name = "notes")
@Data
public class Note {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; 
    private String title; 

    @Column(columnDefinition = "TEXT")
    private String originalContent; 

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(columnDefinition = "TEXT")
    private String flashcards;

    @Column(columnDefinition = "TEXT")
    private String questions;


}
