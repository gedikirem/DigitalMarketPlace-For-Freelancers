package com.freelanciaApp.FreelanciaWorld.repository;

import com.freelanciaApp.FreelanciaWorld.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin> findByAuthorityLevel(String authorityLevel);
}
