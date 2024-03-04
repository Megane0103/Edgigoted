package com.medic.edgigoted.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "salles")
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type; // Consultation, Operation, Waiting, etc.
    private boolean isOccupied;

    // Constructors, getters, and setters
}