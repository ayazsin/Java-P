package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class Exceptions {

    public static void main(String[] args) throws IOException {

        int n1 = 34;
        int n2 = 0;
        String s = null;

        try {
            int sum = n1/n2;
            System.out.println("ici");
        } catch (Exception e) {
            System.err.println("ArithmeticException: / by zero");
        }

        List <String> list = new ArrayList<>();
        list.add("fatih");
        list.add("ayse");
        list.add("orhan");
        list.add("betul");

        try {
            for (int i = 0; i <= list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (Exception e) {
            System.err.println("IndexOutOfBoundsException");
        }

        FileWriter fw = new FileWriter("nx.txt");
        fw.write("cocou");
        fw.close();

       // FileInputStream fileInputStream2 = new FileInputStream("/Users/ayse/eclipse-workspace/JSE_02_FCT/src/exceptions/nn.txt");


        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/ayse/eclipse-workspace/JSE_02_FCT/src/exceptions/n.txt");
            int i = 0;
            while ((i=fileInputStream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.err.println("NullPointerException");
        }

    }


}
