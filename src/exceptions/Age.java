package exceptions;

import java.util.Scanner;

public class Age {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int age = 0;

       do{

           System.out.println("Enter an age");
           try {

               age = scanner.nextInt();
               try {
                   ageValid(age);
                   System.out.println("It is a valid age");
                   isValid = true;

               } catch (Exception e) {
                   System.err.println("Invalid age");;
               }
           } catch (Exception e) {
               System.out.println("invalid type");
               scanner.next();

           }


       } while(isValid == false);

    }


    public static void ageValid(int age) throws Exception {
        if(age >110) {
            throw (new Exception("Invalid age"));
        }
    }


}
