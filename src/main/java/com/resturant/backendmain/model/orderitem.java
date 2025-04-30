package com.resturant.backendmain.model;


import jakarta.persistence.*;

@Entity

public class orderitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "meal_id", referencedColumnName = "id")
    private Meal meal;
}
