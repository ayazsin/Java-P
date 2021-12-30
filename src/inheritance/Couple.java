package inheritance;

public class Couple extends Personne{
    private Personne spouse;

    public Couple(String nom, int age, Personne spouse) {
        super(nom, age);
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return super.toString() + " Je suis marie avec " + this.spouse.getNom() + ".";
    }
}
