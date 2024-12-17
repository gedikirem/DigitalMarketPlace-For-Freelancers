package com.freelancer.freelancia.service;
import com.freelancer.freelancia.model.PortfolioItem;
import com.freelancer.freelancia.repository.PortfolioItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PortfolioItemService {
    private final PortfolioItemRepository portfolioItemRepository;

    @Autowired
    public PortfolioItemService(PortfolioItemRepository portfolioItemRepository) {
        this.portfolioItemRepository = portfolioItemRepository;
    }

    // Tüm portföy öğelerini getir
    public List<PortfolioItem> getAllPortfolioItems() {
        return portfolioItemRepository.findAll();
    }

    // ID'ye göre portföy öğesi getir
    public Optional<PortfolioItem> getPortfolioItemById(Long id) {
        return portfolioItemRepository.findById(id);
    }

    // Portföy öğesini kaydet veya güncelle
    public PortfolioItem saveOrUpdatePortfolioItem(PortfolioItem portfolioItem) {
        return portfolioItemRepository.save(portfolioItem);
    }

    // Portföy öğesini sil
    public void deletePortfolioItem(Long id) {
        portfolioItemRepository.deleteById(id);
    }
}
