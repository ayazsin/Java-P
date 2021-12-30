package enumm;

public enum Feus {
    ROUGE("Je stoppe!"), ORANGE("Je freine!"), VERT("Je passe!");
    String val;

    Feus(String s) {
        val = s;
    }

    public void circulation() {
        System.out.println(val);
    }

    public void circulation(Feus feu) {

        switch(feu) {
            case ROUGE:
                System.out.println("Je stoppe!");
                break;
            case VERT:
                System.out.println("Je passe!");
                break;
            case ORANGE:
                System.out.println("Je freine!");
                break;
        }
    }






}
