package functionalinterface;

import org.testng.annotations.Test;

public class IntegerValueTest  {
    @Test
    public void testExchangeValues() {
        System.out.println("Test Case 1:");
        FactorialFinder.exchangeValues(5, 10);

        System.out.println("\nTest Case 2:");
        FactorialFinder.exchangeValues(-3, 7);

        System.out.println("\nTest Case 3:");
        FactorialFinder.exchangeValues(0, 0);
    }
}