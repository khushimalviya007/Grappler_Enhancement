package com.Grappler.enhancement.Entity;

import jakarta.persistence.*;

@Entity
public class Template_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String description;
}
