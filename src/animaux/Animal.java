package animaux;

 abstract public class  Animal {

     public String nom;

     public Animal(String nom) {
         this.nom = nom;
     }

     public abstract void mange();
     public void boit() {
         System.out.println(this.nom + " boivent de l'eau...");
     };
     public abstract void seDeplace();

}
