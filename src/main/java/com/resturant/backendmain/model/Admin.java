package com.resturant.backendmain.model;

import jakarta.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String email;
    private String passwordHash;
    @Enumerated(EnumType.STRING)
    private Role role;

    // Getters and Setters
}

enum Role {
    MANAGER, SUPPORT, DELIVERY
}