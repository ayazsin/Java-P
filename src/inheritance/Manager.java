package inheritance;

public class Manager extends Salarie{
    private int nombreDeSalaries;

    public Manager(String nom, int age, String societe, int nombreDeSalaries) {
        super(nom, age, societe);
        this.nombreDeSalaries = nombreDeSalaries;
    }

    @Override
    public String toString() {
        return super.toString() + " Je suis responsable de " + this.nombreDeSalaries + " personnes.";
    }
}
