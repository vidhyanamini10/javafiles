package streamsLambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
    @Test
    public void testPerformAddition() {
        Addition addition = new Addition();

        // Test Case 1: Positive numbers
        int result1 = addition.performAddition(5, 3);
        System.out.println(result1 == 8 ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Negative numbers
        int result2 = addition.performAddition(-10, -5);
        System.out.println(result2 == -15 ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Mixed numbers
        int result3 = addition.performAddition(7, -2);
        System.out.println(result3 == 5 ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }

}
