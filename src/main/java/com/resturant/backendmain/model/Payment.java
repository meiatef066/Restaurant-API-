package com.resturant.backendmain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long amount;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private Date paymentDate;

    // Getters and Setters

    public enum PaymentStatus {
        PENDING, COMPLETED, FAILED

    }
}
