package genericClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic<T> {

    public T[] list;
    public List <T> liste;

    public Generic(T[] list) {
        this.list = list;
    }

    public Generic() {
        this.liste = new ArrayList<>();
    }

    public void add(T t) {
        this.liste.add(t);
    }

    public void display() {
        int i=0;
        System.out.println("->DEBUT...");
        for (T el:this.list) {
            System.out.println(i+" -->" + el);
            if (i%3 == 2) System.out.println();
            i++;
        }
        System.out.println("...END");
    }

    public void displayList() {
        int i=0;
        System.out.println("->DEBUT...");
        for (T el:this.liste) {
            System.out.println(i+" -->" + el);
            if (i%3 == 2) System.out.println();
            i++;
        }
        System.out.println("...END");
    }



    public T median() {
        int ind = list.length % 2 == 1 ? list.length/2 : list.length/2-1;
        return list[ind];
    }

    @Override
    public String toString() {
        return "Generic{" +
                ", liste=" + liste +
                '}';
    }
}
