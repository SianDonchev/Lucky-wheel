package com.luckywheel.LuckyWheelApp.dao.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ClientUser")
public class ClientUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientUserId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "signup_date", nullable = false)
    private LocalDateTime signUpDate;

    @Column(name = "last_login_date")
    private LocalDateTime lastLoginDate;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    // Constructors, Getters, and Setters
}
