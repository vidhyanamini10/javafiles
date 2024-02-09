package streamsLambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class ElementFinderTest {
    @Test
    public void testFindMaximumElement() {
        ElementFinder finder = new ElementFinder();

        // Test Case 1: Normal case with strings in natural sorting order
        List<String> input1 = Arrays.asList("apple", "banana", "orange");
        Optional<String> expected1 = Optional.of("orange");
        Optional<String> result1 = finder.findMaximumElement(input1);
        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Strings in reverse natural sorting order
        List<String> input2 = Arrays.asList("zebra", "lion", "elephant");
        Optional<String> expected2 = Optional.of("zebra");
        Optional<String> result2 = finder.findMaximumElement(input2);
        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Single string in the list
        List<String> input3 = Arrays.asList("tiger");
        Optional<String> expected3 = Optional.of("tiger");
        Optional<String> result3 = finder.findMaximumElement(input3);
        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test Case 4: Empty list
        List<String> input4 = Arrays.asList();
        Optional<String> expected4 = Optional.empty();
        Optional<String> result4 = finder.findMaximumElement(input4);
        System.out.println(result4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");
    }

}
