package com.freelanciaApp.FreelanciaWorld.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

@Table(name = "customers")
public class Customer extends User {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;



    // Builder Pattern
    public static class CustomerBuilder {
        private String name;
        private String email;
        @Getter
        private String phoneNumber;

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.setName(this.name);
            customer.setEmail(this.email);
            return customer;
        }
    }
    @OneToMany(mappedBy = "customer")
    @JsonBackReference // Bağlı taraf
    private List<Project> projects = new ArrayList<>();
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public long getPhoneNumber() {
        return 0;
    }

    @Override
    public long setPhoneNumber(String number) {
        return 0;
    }
}
