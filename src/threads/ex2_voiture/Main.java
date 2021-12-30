package threads.ex2_voiture;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Usine c = new Usine("carrosserie");
        Usine m = new Usine("moteur");
        Usine a = new Usine("assemblage");



        c.start();
        m.start();
        c.join();
        m.join();
        a.start();






    }
}
