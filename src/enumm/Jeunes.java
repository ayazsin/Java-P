package enumm;

public enum Jeunes {
    ENFANT(0,11), ADO(12,14), JUNIOR(15,18);

    int min;
    int max;

    Jeunes(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void age() {
        if (this.max < 12) {
            System.out.println("Je suis: ENFANT et donc j'ai entre 0 et 11 ans");
        } else if (this.max < 15) {
            System.out.println("Je suis: ADO et donc j'ai entre 12 et 14 ans");
        } else {
            System.out.println("Je suis: JUNIOR et donc j'ai entre 15 et 18 ans");
        }

    }
}
