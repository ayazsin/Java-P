package geometrie;

import org.junit.Assert;
import org.junit.Test;


public class RunnerTest {

    @Test
    public void test2() {
       Rectangle rectangle = new Rectangle(100, 300, 4, 5);
       rectangle.move(23,56);
        System.out.println(rectangle);

        Assert.assertEquals(18.0, rectangle.perimetre(), 0.0);
    }

}