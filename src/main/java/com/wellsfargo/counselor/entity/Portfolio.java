package com.example.entities;

package com.example.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Security> securities;

    // JPA requires a default no-arg constructor
    public Portfolio() {}

    // Constructor initializing all instance variables
    public Portfolio(Client client, List<Security> securities) {
        this.client = client;
        this.securities = securities;
    }

    // Getters
    public Long getId() { return id; }
    public Client getClient() { return client; }
    public List<Security> getSecurities() { return securities; }

    // Setters (No setter for ID)
    public void setClient(Client client) { this.client = client; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Security> securities;

    // JPA requires a default no-arg constructor
    public Portfolio() {}

    // Constructor initializing all instance variables
    public Portfolio(Client client, List<Security> securities) {
        this.client = client;
        this.securities = securities;
    }

    // Getters
    public Long getId() { return id; }
    public Client getClient() { return client; }
    public List<Security> getSecurities() { return securities; }

    // Setters (No setter for ID)
    public void setClient(Client client) { this.client = client; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}