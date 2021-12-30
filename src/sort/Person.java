package sort;

public class Person implements Comparable<Person> {

    private String nom;
    private double salarie;

    public Person(String nom, double salarie) {
        this.nom = nom;
        this.salarie = salarie;
    }


    @Override
    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", salarie=" + salarie +
                '}' + "\n";
    }

    @Override
    public int compareTo(Person o) {
      // return this.nom.compareToIgnoreCase(o.nom);
         return (int) (o.salarie - this.salarie);
    }
}
