package com.phdareys.shop.model;

import com.phdareys.shop.model.bean.Client;
import com.phdareys.shop.model.bean.Product;

import java.text.SimpleDateFormat;
import java.util.*;

public class Order {

    private String orderRef;
    private HashMap<Product, Integer> produitList;
    private HashMap<String, Double> produitListWithSubTotal;
    private double total;
    static int compte = 1;
    static String dateCurrent;
    private Client client;
    private double tVA;

    public Order(Client client) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(new Date());
        if (dateCurrent == null) {
            dateCurrent = date;
        } else if (!dateCurrent.equals(date)){
            compte = 1;
        }

        if (compte < 10) {
            this.orderRef = date + "_0000" + compte;
        } else if(compte < 100) {
            this.orderRef = date + "_000" + compte;
        }
        this.produitList = new HashMap<>();
        this.client = client;

        compte++;

    }

    public void addProduitAndQuantity(Product product, int quantity) {
        this.produitList.put(product, quantity);
    }

    public void calculTotal() throws OrderException {
        HashMap<String, Double> newGetProduitListWithPrice = new HashMap<>();
        for (Map.Entry<Product, Integer> entry : produitList.entrySet()) {
            newGetProduitListWithPrice.put(entry.getKey().getNom() + " x " + entry.getValue(), entry.getKey().getPrix() * entry.getValue() );
        }
        this.produitListWithSubTotal = newGetProduitListWithPrice;
        this.total = newGetProduitListWithPrice.values().stream().reduce(0.0,(t, u) -> t + u);
        this.tVA = this.total * OrderEnums.TVA.getTaux();
        this.total = this.total * 1.2 + 20;

        if (total > 200) {
            throw (new OrderException("Error ----> La commande est trop élevée " + client.getNom()));
        }
    }

    public String getOrderRef() {
        return orderRef;
    }

    public HashMap<Product, Integer> getProduitList() {
        return produitList;
    }

    public HashMap<String, Double> getProduitListWithSubTotal() {
        return produitListWithSubTotal;
    }

    public double getTotal() {
        return total;
    }

    public static int getCompte() {
        return compte;
    }

    public static String getDateCurrent() {
        return dateCurrent;
    }

    public Client getClient() {
        return client;
    }

    public double gettVA() {
        return tVA;
    }

    @Override
    public String toString() {
        return "Order Reference:    " + orderRef +
                "\nProducts & Subtotal:   " + produitListWithSubTotal +
                "\nTVA(%20):    €" + tVA +
                "\nTransport:   €" + OrderEnums.TRANSPORT.getTaux() +
                "\nTotal HT:    €" + total +
                "\nClient:  " + client.getNom().toUpperCase() + ", " + client.getPrenom() +
                "\nAddress: " + client.getAddress();
    }
}
