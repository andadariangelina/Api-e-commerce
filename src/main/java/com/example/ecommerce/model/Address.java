package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private AddressType type;

    private String line1;

    private String line2;

    private String city;

    private String province;

    private String postcode;

    // constructors, getters, and setters
}
