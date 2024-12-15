package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name ="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating;

    private String comment;

    private LocalDateTime reviewDate;

    @PrePersist
    protected void onCreate() {
        this.reviewDate = LocalDateTime.now();
    }

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
