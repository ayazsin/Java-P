package animaux;

public class Runner {

    public static void main(String[] args) {

        OiseauxProie aigle = new OiseauxProie("aigle");
        PetitOiseau  perroquet = new PetitOiseau("perroquet");
        Felin tigre = new Felin("tigre");

        aigle.boit();
        aigle.mange();
        aigle.seDeplace();

        perroquet.mange();

        tigre.boit();
        tigre.mange();
        tigre.seDeplace();

    }
}
