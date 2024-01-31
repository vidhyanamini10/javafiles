package functionalinterface;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void testSwapWithoutThirdVariable() {
        int a = 5;
        int b = 10;

        assertEquals("Before swapping: a = 5, b = 10", "Before swapping: a = " + a + ", b = " + b);

        // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        assertEquals("After swapping: a = 10, b = 5", "After swapping: a = " + a + ", b = " + b);
    }
}
