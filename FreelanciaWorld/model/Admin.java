package com.freelanciaApp.FreelanciaWorld.model;

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

    public static void setInstance(Admin instance) {
        Admin.instance = instance;
    }

    public String getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(String authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public long getPhoneNumber() {
        return 0;
    }

    @Override
    public long setPhoneNumber(String number) {
        return 0;
    }
}