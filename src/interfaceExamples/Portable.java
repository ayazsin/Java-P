package interfaceExamples;

public class Portable implements Objet{

    private String id;
    private String nom;
    private String marque;
    private double prix;
    private String info;

    public Portable(String id, String nom, String marque, double prix, String info) {

        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.info = info;
    }


    @Override
    public void vendre() {
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public double getPrix() {
        return this.prix;
    }


}
