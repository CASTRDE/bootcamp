package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();
        BaseDemo baseDemo1 = new BaseDemo();
        BaseDemo baseDemo2 = new BaseDemo();

        String expected = "Hello World";
        int sum = 5;
        int sum1 = 10;

        assertEquals(expected, baseDemo.print());
        assertEquals(sum, baseDemo1.sum(2,3));
        assertEquals(sum1, baseDemo2.sum(sum, 5));
    }
}
