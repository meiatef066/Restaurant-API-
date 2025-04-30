package com.resturant.backendmain.model;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
public class customerreviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String comment;
    private Date reviewDate;
    @Enumerated(EnumType.STRING)
    private Rating rate;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

}
