package interfaceExamples;

public class Livre implements Objet{

    private String id;
    private String nom;
    private double prix;
    private String auteur;
    private String synopsis;

    public Livre(String id, String nom, double prix, String auteur, String synopsis) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.auteur = auteur;
        this.synopsis = synopsis;
    }

    @Override
    public void vendre() {
        System.out.println("livre est vendable");

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
