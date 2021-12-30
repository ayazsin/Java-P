package com.phdareys.shop.model.bean;

public class Product {

    private String reference;
    private double prix;
    private String nom;
    private String marque;

    public Product(String reference, double prix, String nom, String marque) {
        this.reference = reference;
        this.prix = prix;
        this.nom = nom;
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }
}
