package bibliotheque;

public class Livre {

    private String titre;
    private Genres genre;
    private String resume;

    public Livre(String titre, Genres genre, String resume) {
        this.titre = titre;
        this.genre = genre;
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", genre=" + genre +
                ", resume='" + resume + '\'' +
                '}';
    }
}
