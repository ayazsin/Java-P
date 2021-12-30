package com.phdareys.shop.model;

import com.phdareys.shop.model.bean.Client;
import com.phdareys.shop.model.bean.Harness;
import com.phdareys.shop.model.bean.Robe;
import com.phdareys.shop.model.bean.Shoe;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

    @Test
    public void test1() {

        Client john = new Client("Brown", "John", "j.brown@gmail.com", "3 Quai des Marronniers Toulouse - 31000");
        Client marc = new Client("Taiwan", "Marc", "marc@gmail.com", "48 Rue de Metz Paris - 12000");

        Harness harnessEnfant01 = new Harness("012345", 25, "harnessEnfant01", "Miller", 35);
        Harness harnessAdult01 = new Harness("012367", 45, "harnessAdult01", "Miller", 75);

        Shoe shoeFils01 = new Shoe("023456", 50, "shoeFils01", "Giesswein", 30);
        Shoe shoeFemme01 = new Shoe("023457", 60, "shoeFemme01", "Jules", 38);

        Robe robeFille01 = new Robe("034567", 35, "robeFille01", "Zapaka", 135, "rouge");
        Robe robeFemme01 = new Robe("034567", 22.99, "robeFemme01", "Wolike", 164, "beige");

        Order commande1 = new Order(john);
        commande1.addProduitAndQuantity(robeFille01,2);
        commande1.addProduitAndQuantity(harnessEnfant01,3);

        try {
            commande1.calculTotal();
        } catch (OrderException e) {
            System.err.println(e.getMessage());
        }

        Assert.assertTrue(commande1.getTotal()==194);

        Order commande2 = new Order(marc);
        commande2.addProduitAndQuantity(robeFemme01,4);
        commande2.addProduitAndQuantity(harnessAdult01,3);

        try {
            commande2.calculTotal();
        } catch (OrderException e) {
            System.err.println(e.getMessage());
        }

        Assert.assertTrue(commande2.getOrderRef().equals("2021-12-02_00002"));
    }

}
