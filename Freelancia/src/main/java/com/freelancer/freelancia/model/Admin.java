package com.freelancer.freelancia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "admins")
public class Admin  extends Users{
    private String authorityLevel;
}
