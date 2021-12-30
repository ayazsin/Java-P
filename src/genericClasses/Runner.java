package genericClasses;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        OutilsJardin [] outilsJardinsArray = {
                new OutilsJardin("beche", 20),
                new OutilsJardin("pelle", 10),
                new OutilsJardin("taille-haie", 50),
                new OutilsJardin("secateur", 10),
                new OutilsJardin("taille-branche", 100),
                new OutilsJardin("rateau", 8)};

        JoueursFoot [] joueursFootsArray = {
                new JoueursFoot("Neymar", "PSG"),
                new JoueursFoot("Zidane", "RM"),
                new JoueursFoot("Mbappe", "PSG"),
                new JoueursFoot("Messi", "Barcelone"),
                new JoueursFoot("Dimaria", "PSG"),
                new JoueursFoot("Bale", "RM"),
                new JoueursFoot("Ronaldo", "MU")};

        Boolean [] booleans = {true,true,false,true,false,true,false,true};

        GenericMethodTest.printArray(outilsJardinsArray);
        GenericMethodTest.printArray(joueursFootsArray);
        GenericMethodTest.printArray(booleans);

        Generic<OutilsJardin> outilsJardinGeneric = new Generic<>(outilsJardinsArray);
        outilsJardinGeneric.display();
        System.out.println(outilsJardinGeneric.median());
//
//
//        List<JoueursFoot> joueursFootList = new ArrayList<>();
//
//
//        Generic<JoueursFoot> joueursFootGeneric = new Generic<>();
//        joueursFootList.add(new JoueursFoot("Neymar", "PSG"));
//       // System.out.println(joueursFootList + "nnnn");
//
//       joueursFootGeneric.add(new JoueursFoot("Neymar", "PSG"));
//       joueursFootGeneric.add(new JoueursFoot("Zidane", "RM"));
//
//       joueursFootGeneric.displayList();
//
//







    }




}
