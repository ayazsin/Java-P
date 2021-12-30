package exceptions;

public class BanqueController {

    public static void main(String[] args) {

        Banque compte1 = new Banque("John");
        compte1.rajoute(300);

        try {
            compte1.retire(500);
        } catch (BanqueException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n" + compte1);
    }


}
