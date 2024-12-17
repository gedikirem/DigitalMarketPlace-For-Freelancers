package com.freelancer.freelancia.repository;

import com.freelancer.freelancia.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin> findByAuthorityLevel(String authorityLevel);
}
