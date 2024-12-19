package com.freelanciaApp.FreelanciaWorld.repository;

import com.freelanciaApp.FreelanciaWorld.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Müşteriyi email adresine göre bulmak
    Optional<Customer> findByEmail(String email);

    // Müşteri adını içerenleri aramak
    List<Customer> findByNameContaining(String name);
}
