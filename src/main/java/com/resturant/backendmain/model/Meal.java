package com.resturant.backendmain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int price;
    @Enumerated(EnumType.STRING)
    private MealSize sizeOptions;
    private byte[] imageUrl; // For storing image as BLOB
    @Enumerated(EnumType.STRING)
    private Availability isAvailable;
    private int prepTime;

    @ManyToMany
    @JoinTable(
            name = "meal_category_mapping",
            joinColumns = @JoinColumn(name = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<mealcategory> categories;
}
