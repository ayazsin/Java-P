package interfaceExamples;

public class Runner {

    public static void main(String[] args) {

        Livre livre = new Livre("123", "le petit prince", 23.56, "Antoine de Saint-Exupéry", "...");
        RaquetteTennis raquetteTennis = new RaquetteTennis("456","xyle", 123.50, "..." );
        Portable portable = new Portable("456", "note12", "samsung", 1200, "..." );

        System.out.println(livre.getId());

        livre.vendre();
        raquetteTennis.vendre();
        portable.vendre();
    }
}
