package com.phdareys.shop.model.bean;

public class Client {

    private String nom;
    private String prenom;
    private String email;
    private String address;

    public Client(String nom, String prenom, String email, String address) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.address = address;
    }

    public String getNom() {
        return nom;
    }

    public String getAddress() {
        return address;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }
}
