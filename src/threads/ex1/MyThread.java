package threads.ex1;

public class MyThread extends Thread{

    private String task;

    public MyThread(String task) {
        this.task = task;
    }

    public void run() {
        //coder la méthode
        int tempo = 1000;
        if (this.task.equals(" task1"))
            tempo=2000;
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("num: " + i +" " + task);
        }
    }
}
