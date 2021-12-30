package animaux;

public class OiseauxProie extends Oiseau{
    public OiseauxProie(String nom) {
        super(nom);
    }

    @Override
    public void mange() {

        System.out.println(this.nom + " mangent de la viande");

    }
}
