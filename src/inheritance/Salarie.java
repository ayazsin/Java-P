package inheritance;

public class Salarie extends Personne{

    private String societe;

    public void setSociete(String societe) {
        this.societe = societe.toUpperCase(); }

    public Salarie (String nom, int age, String societe) {
        super(nom,age);
        setSociete(societe); }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" et mon entreprise est " + this.societe);
    }

    @Override
    public String toString() {
        return super.toString() + " Je travaille chez " + this.societe + "." ;
    }
}
