package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;

    private String note;

    private Integer total;

    private Integer discount;

    private Boolean isPaid;

    // constructors, getters, and setters
}
