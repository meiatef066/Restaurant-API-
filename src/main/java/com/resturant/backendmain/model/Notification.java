package com.resturant.backendmain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    private String message;
    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;
    private Date sendDate;
    @Enumerated(EnumType.STRING)
    private NotificationStatus status;

    // Getters and Setters
}

enum NotificationType {
    ORDER, PROMOTION, REMINDER
}

enum NotificationStatus {
    SENT, PENDING, FAILED
}