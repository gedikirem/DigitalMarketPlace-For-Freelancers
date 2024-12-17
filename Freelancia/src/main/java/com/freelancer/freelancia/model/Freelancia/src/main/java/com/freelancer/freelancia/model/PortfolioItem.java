package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name="portfolio_items")

public class PortfolioItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;


    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    public Portfolio portfolio;

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
