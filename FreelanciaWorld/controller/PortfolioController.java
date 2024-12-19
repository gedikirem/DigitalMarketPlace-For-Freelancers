package com.freelanciaApp.FreelanciaWorld.controller;

import com.freelanciaApp.FreelanciaWorld.model.Portfolio;
import com.freelanciaApp.FreelanciaWorld.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/portfolios")
public class PortfolioController {

    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    // Tüm portföyleri getir
    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return portfolioService.getAllPortfolios();
    }

    // ID'ye göre portföy getir
    @GetMapping("/{id}")
    public Optional<Portfolio> getPortfolioById(@PathVariable Long id) {
        return portfolioService.getPortfolioById(id);
    }

    // Yeni portföy oluştur
    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.saveOrUpdatePortfolio(portfolio);
    }

    // Portföyü güncelle
    @PutMapping("/{id}")
    public Portfolio updatePortfolio(@PathVariable Long id, @RequestBody Portfolio portfolio) {
        portfolio.setId(id);
        return portfolioService.saveOrUpdatePortfolio(portfolio);
    }

    // Portföyü sil
    @DeleteMapping("/{id}")
    public void deletePortfolio(@PathVariable Long id) {
        portfolioService.deletePortfolio(id);
    }
}
