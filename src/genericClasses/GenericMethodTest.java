package genericClasses;

public class GenericMethodTest {

    public static < E > void printArray( E[] inputArray) {

        int i = 1;
        for (E element : inputArray) {
            System.out.println(i + "-->" + element);
            if(i%3==0) System.out.println();
            i++;
        }
        System.out.println();

    }

}
