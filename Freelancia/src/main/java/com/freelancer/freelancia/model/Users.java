package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // Lombok ile getter, setter, toString otomatik üretilir.
@Table(name ="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Otomatik ID üretimi.
    private Long id;

    private String name;

    @Column(unique = true) // E-posta benzersiz olmalı.
    private String email;

    private String password;

}
