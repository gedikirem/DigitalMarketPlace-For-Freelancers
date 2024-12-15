package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "freelancers")
public class Freelancer extends Users{

    private String expertise;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Portfolio portfolio;

    @OneToMany(mappedBy = "freelancer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects;

    @OneToMany(mappedBy = "Freelancer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

}
