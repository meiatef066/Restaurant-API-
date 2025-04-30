package com.resturant.backendmain.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "delivery_id", referencedColumnName = "id")
    private Delivery delivery;

    @ManyToOne
    @JoinColumn(name = "review_id", referencedColumnName = "id")
    private customerreviews review;

    // Getters and Setters
}

enum OrderStatus {
    PENDING, CONFIRMED, DELIVERED, CANCELLED
}
