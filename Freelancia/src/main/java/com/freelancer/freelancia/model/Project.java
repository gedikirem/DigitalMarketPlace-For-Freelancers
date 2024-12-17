package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "projects")

public class Project implements Cloneable{ //PROTOTYPE TASARIM KALIBI
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String name;
    private String description;
    private double budget;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Override
    public Project clone() throws CloneNotSupportedException {
        return (Project) super.clone();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCustomer(Customer customer) {
    }
}
