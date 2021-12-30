package inheritance;

public class Controller {

    public static void main(String[] args) {
        Salarie dupont = new Salarie(" Java SARL ", 35,"Toptan") ;
      //  dupont.afficher();

        Personne dubois = new Salarie(" Andrew Dubois ", 25, "Feza") ;
      //  dupont.afficher();

        Personne ayaz = new Salarie(" Orhan Tugra ", 15, "Ischik") ;
        System.out.println(ayaz);

        Manager manager1 = new Manager("Jean D'arc", 35, "BGE", 15);
        System.out.println(manager1);

        Couple coupleDarc = new Couple("Jeanne", 30, manager1);
        System.out.println(coupleDarc);

        Enfants enfants = new Enfants("Marc",62, dubois,ayaz,dupont);
        System.out.println(enfants);

    }
}
