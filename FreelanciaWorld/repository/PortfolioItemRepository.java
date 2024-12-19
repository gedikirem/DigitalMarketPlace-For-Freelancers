package com.freelanciaApp.FreelanciaWorld.repository;

import com.freelanciaApp.FreelanciaWorld.model.PortfolioItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioItemRepository extends JpaRepository<PortfolioItem,Long> {

    //  PortfolioItem'ları portfolio ID'ye göre listelemek
    List<PortfolioItem> findByPortfolioId(Long portfolioId);

    //  PortfolioItem'ları başlıklarına göre aramak
    List<PortfolioItem> findByTitleContaining(String title);
}
