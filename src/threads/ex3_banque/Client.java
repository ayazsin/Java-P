package threads.ex3_banque;

public class Client extends Thread{

    private String name;

    public Client(String name) {
        this.name = name;
    }
}
