package com.freelanciaApp.FreelanciaWorld.model;


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

    public List<PortfolioItem> getItems() {
        return items;
    }

    public void setItems(List<PortfolioItem> items) {
        this.items = items;
    }

    // Portföyün alt öğeleri
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PortfolioItem> items = new ArrayList<>();

    // Varsayılan Constructor
    public Portfolio() {
    }

    // Alt öğe eklemek için yardımcı metot
    public void addItem(PortfolioItem item) {
        items.add(item);
        item.setPortfolio(this);
    }

    // Alt öğe kaldırmak için yardımcı metot
    public void removeItem(PortfolioItem item) {
        items.remove(item);
        item.setPortfolio(null);
    }
}

