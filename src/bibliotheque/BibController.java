package bibliotheque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibController {

    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.addAutheur("Agatha Christie", "Agatha", "Christie",
                "02-03-1920", "05-05-1990");
        bibliotheque.getAutheur("Agatha Christie").addLivre(new Livre("Les Dix P’tits Nègres",Genres.FIXION,"C’est simple..."));
        bibliotheque.getAutheur("Agatha Christie").addLivre(new Livre(" La Mystérieuse Affaire de Styles",Genres.FIXION,"C’est simple..."));

        bibliotheque.addAutheur("Jules Verne","Jules", "Verne",
                "03-04-1920", "06-07-1990");
        bibliotheque.getAutheur("Jules Verne").addLivre(new Livre("La Tour du monde",Genres.ROMAN,"Jules Verne, né..."));
        bibliotheque.getAutheur("Jules Verne").addLivre(new Livre("L'ile mysterieuse",Genres.ROMAN,"Jules Verne, né..."));


        for (Map.Entry<String, Autheur> entry : bibliotheque.getListAutheur().entrySet()) {
            System.out.println(entry.getValue());
        }

        bibliotheque.deleteAutheur("Agatha");


        bibliotheque.getAutheur("toto");



    }
}
