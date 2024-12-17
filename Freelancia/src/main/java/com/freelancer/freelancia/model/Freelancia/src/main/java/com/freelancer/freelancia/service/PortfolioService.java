package com.freelancer.freelancia.service;

import com.freelancer.freelancia.model.Portfolio;
import com.freelancer.freelancia.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PortfolioService
{
    private final PortfolioRepository portfolioRepository;

    @Autowired
    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    // Tüm portföyleri getir
    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    // ID'ye göre portföy getir
    public Optional<Portfolio> getPortfolioById(Long id) {
        return portfolioRepository.findById(id);
    }

    // Portföyü kaydet veya güncelle
    public Portfolio saveOrUpdatePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    // Portföyü sil
    public void deletePortfolio(Long id) {
        portfolioRepository.deleteById(id);
    }
}
