package com.freelanciaApp.FreelanciaWorld.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "projects")

public class Project implements Cloneable{ //PROTOTYPE TASARIM KALIBI
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String title;
    private String name;
    private String description;
    private double budget;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference // Ana taraf
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Override
    public Project clone() throws CloneNotSupportedException {
        return (Project) super.clone();
    }

    public void setCustomer(Customer customer) {
    }
}