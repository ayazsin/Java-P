package genericClasses;

public class OutilsJardin {

    private String nom;
    private double prix;

    public OutilsJardin(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "OutilsJardin{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
