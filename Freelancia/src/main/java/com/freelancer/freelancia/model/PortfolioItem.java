package com.freelancer.freelancia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="portfolio_items")
public class PortfolioItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemTitle;

    private String filePath;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;
}
