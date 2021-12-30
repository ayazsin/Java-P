package animaux;

public class PetitOiseau extends Oiseau{
    public PetitOiseau(String nom) {
        super(nom);
    }

    @Override
    public void mange() {
        System.out.println(this.nom + " mangent des graines");
    }
}
