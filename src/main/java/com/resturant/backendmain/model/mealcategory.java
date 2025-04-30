package com.resturant.backendmain.model;

import jakarta.persistence.*;

@Entity
public class mealcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean isActive;
}
