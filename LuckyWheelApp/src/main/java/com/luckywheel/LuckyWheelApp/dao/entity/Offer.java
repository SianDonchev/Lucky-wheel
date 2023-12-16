package com.luckywheel.LuckyWheelApp.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double prize;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private BusinessUser owner;

    // Constructors, Getters, and Setters
}
