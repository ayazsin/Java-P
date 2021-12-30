package exceptions;

import java.util.Date;

public class Banque {

    private String name;
    private double balance;

    public Banque(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void  rajoute(double balance) {
        this.balance += balance;
    }

    public void retire(double balance) throws BanqueException {
        this.balance -= balance;
        if (this.balance< 0) {
            this.balance -= 30;
            throw (new BanqueException("Error --> pas suffisant balance", BanqueEnum.ERROR));
        }else if (this.balance < 100) {
            throw (new BanqueException("Warning --> Attention moins de 100$ sur le compte!!", BanqueEnum.WARNING));
        }

    }





    @Override
    public String toString() {
        return "Page{" +
                "name='" + name + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
