package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    private String title;

    private String description;

    private String price;

    private Integer stock;

    // constructors, getters, and setters
}
