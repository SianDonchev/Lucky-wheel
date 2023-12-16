package com.luckywheel.LuckyWheelApp.dao.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "UserWins")
public class UserWins {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_user_id", nullable = false)
    private ClientUser client;


    @ManyToOne
    @JoinColumn(name = "offer_id", nullable = false)
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "business_client_id", nullable = false)
    private BusinessUser businessClient;

    @Column(name = "date_of_payment")
    private LocalDateTime dateOfPayment;

    @Column(name = "date_of_win", nullable = false)
    private LocalDateTime dateOfWin;

    @Column(name = "expiration_date", nullable = false)
    private LocalDateTime expirationDate;

    // Constructors, Getters, and Setters
}
