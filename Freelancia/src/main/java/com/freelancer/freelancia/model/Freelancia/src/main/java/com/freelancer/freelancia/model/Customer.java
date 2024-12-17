package com.freelancer.freelancia.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor

@Table(name = "customers")
public class Customer extends User {
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
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
