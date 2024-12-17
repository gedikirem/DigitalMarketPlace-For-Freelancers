package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "portfolios")

public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PortfolioItem> items = new ArrayList<>();

    public void addItem(PortfolioItem item) {
        items.add(item);
        item.setPortfolio(this);
    }

    public void removeItem(PortfolioItem item) {
        items.remove(item);
        item.setPortfolio(null);
    }
}
