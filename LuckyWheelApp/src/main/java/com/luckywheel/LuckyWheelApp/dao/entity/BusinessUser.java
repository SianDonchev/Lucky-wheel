package com.luckywheel.LuckyWheelApp.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "BusinessUser")
public class BusinessUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessUserId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "signup_date", nullable = false)
    private LocalDateTime signUpDate;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "number_of_offers", nullable = false)
    private Integer numberOfOffers;

    // Constructors, Getters, and Setters
}
