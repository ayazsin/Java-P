package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Autheur {

    private String prenom;
    private String nom;
    private String dateBirth;
    private String dateMorte;
    private List<Livre> livreList;


    public Autheur(String prenom, String nom, String dateBirth, String dateMorte) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateBirth = dateBirth;
        this.dateMorte = dateMorte;
        this.livreList = new ArrayList<>();
    }

    public void addLivre(Livre livre) {
        livreList.add(livre);
    }



    @Override
    public String toString() {
        return "Autheur{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", dateMorte='" + dateMorte + '\'' +
                ", livreList=" + livreList +
                '}';
    }
}
