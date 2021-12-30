package animaux;

public class Felin extends Animal{


    public Felin(String nom) {
        super(nom);
    }

    @Override
    public void mange() {
        System.out.println(this.nom + " mangent de la viande");

    }

    @Override
    public void seDeplace() {
        System.out.println(this.nom + " marchent");

    }
}
