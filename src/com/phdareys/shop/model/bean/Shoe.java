package com.phdareys.shop.model.bean;

import com.phdareys.shop.model.bean.Product;

public class Shoe extends Product {

    private int taille;

    public Shoe(String reference, double prix, String nom, String marque, int taille) {
        super(reference, prix, nom, marque);
        this.taille = taille;
    }
}
