package streamsLambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

public class SumSquaresTest {
    @Test
    public void testCalculateSumOfSquares() {
        SumSquares calculator = new SumSquares();

        // Test Case 1: Positive integers present
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        int expected1 = 55; // 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 55
        int result1 = calculator.calculateSumOfSquares(input1);
        System.out.println(result1 == expected1 ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Only negative integers present
        List<Integer> input2 = Arrays.asList(-1, -2, -3, -4, -5);
        int expected2 = 0; // No positive integers to square
        int result2 = calculator.calculateSumOfSquares(input2);
        System.out.println(result2 == expected2 ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Mixed positive and negative integers present
        List<Integer> input3 = Arrays.asList(-3, -2, 1, 4, -5);
        int expected3 = 17; // 1^2 + 4^2 = 17
        int result3 = calculator.calculateSumOfSquares(input3);
        System.out.println(result3 == expected3 ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }

}
