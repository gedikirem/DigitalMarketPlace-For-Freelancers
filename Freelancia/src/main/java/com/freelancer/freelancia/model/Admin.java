package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Admin entity representing administrators in the system.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "admins")
public class Admin extends User {

    private static Admin instance;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authorityLevel;

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }


    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getEmail() {
        return "";
    }
}

