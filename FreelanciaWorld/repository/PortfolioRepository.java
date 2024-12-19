package com.freelanciaApp.FreelanciaWorld.repository;

import com.freelanciaApp.FreelanciaWorld.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository  extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findByTitleContaining(String title);
}
