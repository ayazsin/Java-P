package threads.ex1;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread(" task1");


        MyThread t2 = new MyThread(" task3");

        MyThread t3 = new MyThread("         task2");

        MyThread t4 = new MyThread("         task4");
       t1.start();
       t2.start();
       t3.start();
       t4.start();


    }







}
