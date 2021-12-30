package com.phdareys.shop.model.bean;

import com.phdareys.shop.model.bean.Product;

public class Robe extends Product {

    private int longueur;
    private String couleur;

    public Robe(String reference, double prix, String nom, String marque, int longueur, String couleur) {
        super(reference, prix, nom, marque);
        this.longueur = longueur;
        this.couleur = couleur;
    }
}
