package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bids")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;

    private String message;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

}
