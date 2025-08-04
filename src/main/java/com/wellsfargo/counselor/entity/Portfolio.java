package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securityList;

    public Portfolio(Client client) {
        this.client = client;
    }

    public Portfolio() {
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
