package bibliotheque;

import java.util.HashMap;

public class Bibliotheque {

    private HashMap <String, Autheur> listAutheur;
    static int listAutheurSize;

    public Bibliotheque() {
        this.listAutheur = new HashMap<>();
    }

    public void addAutheur(String name, String prenom, String nom, String dateBirth, String dateMorte){
        Autheur autheur = new Autheur(prenom, nom, dateBirth, dateMorte);
        this.listAutheur.put(name, autheur);
        listAutheurSize = listAutheur.size();
    }

    public void deleteAutheur(String name){

        listAutheur.remove(name);
        if (listAutheurSize == listAutheur.size())
            try {
                throw (new NoSuchAutheurException("There is no such autheur in our list"));
            } catch (NoSuchAutheurException e) {
                System.err.println(e.getMessage());
            }
    }

    public Autheur getAutheur(String name) {
        if(listAutheur.get(name)==null)
           try {
                throw (new NoSuchAutheurException("There is no such autheur in our list"));
            } catch (NoSuchAutheurException e) {
                System.err.println(e.getMessage());
            }

        return listAutheur.get(name);
    }

    public HashMap<String, Autheur> getListAutheur() {
        return listAutheur;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "listAutheur=" + listAutheur +
                '}';
    }
}
