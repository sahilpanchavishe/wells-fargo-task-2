package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(nullable = false)
    private String advisorName;

    @Column(nullable = false)
    private String advisorAddress;

    @Column(nullable = false)
    private String advisorEmail;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    public FinancialAdvisor(String advisorName, String advisorAddress, String advisorEmail) {
        this.advisorName = advisorName;
        this.advisorAddress = advisorAddress;
        this.advisorEmail = advisorEmail;
    }

    public FinancialAdvisor() {
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getAdvisorAddress() {
        return advisorAddress;
    }

    public void setAdvisorAddress(String advisorAddress) {
        this.advisorAddress = advisorAddress;
    }

    public String getAdvisorEmail() {
        return advisorEmail;
    }

    public void setAdvisorEmail(String advisorEmail) {
        this.advisorEmail = advisorEmail;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
