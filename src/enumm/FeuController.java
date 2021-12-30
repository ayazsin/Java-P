package enumm;

public class FeuController {

    public static void main(String[] args) {

        Feus feu = Feus.VERT;

        feu.circulation(feu);

        for (Feus feus : Feus.values()) {
            feus.circulation();
        }

    }
}
