package com.resturant.backendmain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String passwordHash;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private CustomerType customerType;
    private boolean status;
    private Date registrationDate;
    private int loyaltyPoints;
}
