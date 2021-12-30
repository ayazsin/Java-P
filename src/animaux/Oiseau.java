package animaux;

public abstract class Oiseau extends Animal{
    public Oiseau(String nom) {
        super(nom);
    }


    @Override
    public void seDeplace() {

        System.out.println(this.nom + " volent");

    }
}
