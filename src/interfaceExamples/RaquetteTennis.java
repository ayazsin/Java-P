package interfaceExamples;

public class RaquetteTennis implements Objet{

    private String ref;
    private String marque;
    private double prix;
    private String jouerVedette;

    public RaquetteTennis(String ref, String marque, double prix, String jouerVedette) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.jouerVedette = jouerVedette;
    }

    @Override
    public void vendre() {
        System.out.println("Raquette de tennis est vendable");
    }

    @Override
    public String getId() {
        return this.ref;
    }

    @Override
    public double getPrix() {
        return this.prix;
    }

}
