package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Enfants extends Personne{
    private List<Personne> enfant = new ArrayList<>();
    public Enfants(String nom, int age, Personne... enfant) {
        super(nom, age);
        this.enfant = List.of(enfant);
    }

    @Override
    public String toString() {
        String s = "";
        for (Personne elt: enfant) {
            s += elt.getNom() + " ";
        }
        return super.toString() + " J'ai " + enfant.size() + " enfants et qu'ils s'appellent " + s ;
    }
}
