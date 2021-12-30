package threads.ex2_voiture;

public class Usine extends Thread{

    private String task;

    public Usine(String task) {
        this.task = task;
    }


    public void run() {

        int max = 5;
        switch (this.task) {
            case "carrosseri" : max = 5;
            break;
            case "moteur" : max = 10;
            break;
            case "assemblage" : max = 5;
            break;
        }

        for (int i = 1; i <= max; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("num: " + i +" " + task);
        }



    }


}
