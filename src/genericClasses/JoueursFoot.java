package genericClasses;

public class JoueursFoot {

    private String nom;
    private String club;

    public JoueursFoot(String nom, String club) {
        this.nom = nom;
        this.club = club;
    }

    @Override
    public String toString() {
        return "JoueursFoot{" +
                "nom='" + nom + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
