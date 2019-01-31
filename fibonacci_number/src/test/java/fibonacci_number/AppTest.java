package fibonacci_number;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testFibonacci1() {
        assertEquals(1, App.getFibonacciNumber(1));
    }

    @Test public void testFibonacci2() {
        assertEquals(1, App.getFibonacciNumber(2));
    }

    @Test public void testFibonacci3() {
        assertEquals(2, App.getFibonacciNumber(3));
    }


}
