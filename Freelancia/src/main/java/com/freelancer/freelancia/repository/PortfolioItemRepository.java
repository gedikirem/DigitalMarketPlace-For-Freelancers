package com.freelancer.freelancia.repository;

import com.freelancer.freelancia.model.Portfolio;
import com.freelancer.freelancia.model.PortfolioItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioItemRepository extends JpaRepository<PortfolioItem,Long> {

    //  PortfolioItem'ları portfolio ID'ye göre listelemek
    List<PortfolioItem> findByPortfolioId(Long portfolioId);

    //  PortfolioItem'ları başlıklarına göre aramak
    List<PortfolioItem> findByTitleContaining(String title);
}
