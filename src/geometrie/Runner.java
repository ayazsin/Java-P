package geometrie;

public class Runner {

    public static void main(String[] args) {

        Forme disque = new Disque(15,3,4);
        Forme rectangle = new Rectangle(5,17,4.7,6.8);
        Forme carre = new Carre(6,2, 4.9);

        disque.move(78, 10);
        rectangle.move(50, 100);
        carre.move(20,20);


        System.out.println(disque);
        System.out.println(rectangle);
        System.out.println(carre);
    }
}
