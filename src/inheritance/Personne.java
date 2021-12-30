package inheritance;

public class Personne {

    private String nom;
    protected int age;

    private void setAge(int age) {
        this.age = age;
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        if (age != 0) setAge(age);
    }



    public Personne() {
        nom = " Nom inconnu ";
    }

    public String getNom() {
      return  this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public void afficher() {
        System.out.println(" Je m'appelle " + nom);
        if (age != 0) {
            System.out.println(" et j’ai " + age + " ans . ");
        }
    }

    @Override
    public String toString() {
        return "Bonjour, je m'appelle " + nom +
                ", j'ai " + age + " ans.";
    }
}
