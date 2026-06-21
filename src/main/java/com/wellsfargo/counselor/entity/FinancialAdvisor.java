package com.example.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;

    // JPA requires a default no-arg constructor
    public FinancialAdvisor() {}

    // Constructor initializing all instance variables
    public FinancialAdvisor(String firstName, String lastName, String email, List<Client> clients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.clients = clients;
    }

    // Getters
    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public List<Client> getClients() { return clients; }

    // Setters (No setter for ID)
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}