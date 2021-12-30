package com.phdareys.shop.model;

public enum OrderEnums {

    TVA(0.20), TRANSPORT(20), ERROR(200);
    double taux;

    OrderEnums(double i) {
        taux = i;
    }

    public double getTaux() {
        return taux;
    }
}
