package streamsLambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

public class NumberProcessorTest {
    @Test
    public void testFilterAndDouble() {
        NumberProcessor numberProcessor = new NumberProcessor();

        // Test Case 1: Even numbers and negative numbers present
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected1 = Arrays.asList(2, 6, 10);
        List<Integer> result1 = numberProcessor.filterAndDouble(input1);
        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Only odd numbers present
        List<Integer> input2 = Arrays.asList(3, 5, 7, 9);
        List<Integer> expected2 = Arrays.asList(6, 10, 14, 18);
        List<Integer> result2 = numberProcessor.filterAndDouble(input2);
        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: No odd numbers present
        List<Integer> input3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected3 = Arrays.asList();
        List<Integer> result3 = numberProcessor.filterAndDouble(input3);
        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }

}
