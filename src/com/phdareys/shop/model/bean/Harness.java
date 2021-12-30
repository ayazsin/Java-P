package com.phdareys.shop.model.bean;

import com.phdareys.shop.model.bean.Product;

public class Harness extends Product {

    private int poids;


    public Harness(String reference, double prix, String nom, String marque, int poids) {
        super(reference, prix, nom, marque);
        this.poids = poids;
    }
}
