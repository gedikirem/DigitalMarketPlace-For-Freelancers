package com.freelanciaApp.FreelanciaWorld.model;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    public Portfolio portfolio;

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}

