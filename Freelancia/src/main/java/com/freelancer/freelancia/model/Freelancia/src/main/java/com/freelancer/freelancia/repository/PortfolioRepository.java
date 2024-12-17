package com.freelancer.freelancia.repository;

import com.freelancer.freelancia.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository  extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findByTitleContaining(String title);
}
