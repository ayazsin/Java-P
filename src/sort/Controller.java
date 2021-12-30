package sort;

import java.util.Arrays;

public class Controller {

    public static void main(String[] args) {

        Person [] person = {
                new Person("Orcun",500),
                new Person("Berra",2500),
                new Person("Fusun", 1000),
                new Person("Halit",1000)
        };

        Arrays.sort(person);
        System.out.println(Arrays.toString(person));

    }
}
