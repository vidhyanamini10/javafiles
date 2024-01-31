package functionalinterface;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class IntegerValueTest  {
    @Test
    public void testExchangeValues() {
        System.out.println("Test Case 1:");
        IntegerValue.exchangeValues(5, 10);

        System.out.println("\nTest Case 2:");
        IntegerValue.exchangeValues(-3, 7);

        System.out.println("\nTest Case 3:");
        IntegerValue.exchangeValues(0, 0);
    }
}