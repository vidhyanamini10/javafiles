package streamsLambda;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;

public class StringFilterTest {
    @Test
    public void testFilterStrings() {
        StringFilter stringFilter = new StringFilter();

        // Test Case 1: Filter strings starting with "A"
        List<String> input1 = Arrays.asList("Apple", "Banana", "Apricot", "Orange");
        List<String> expected1 = Arrays.asList("Apple", "Apricot");
        List<String> result1 = stringFilter.filterStrings(input1, s -> s.startsWith("A"));
        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Filter strings starting with "B"
        List<String> input2 = Arrays.asList("Ball", "Car", "Boat", "Bus");
        List<String> expected2 = Arrays.asList("Ball", "Boat", "Bus");
        List<String> result2 = stringFilter.filterStrings(input2, s -> s.startsWith("B"));
        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Filter strings starting with "C"
        List<String> input3 = Arrays.asList("Cat", "Dog", "Elephant", "Cow");
        List<String> expected3 = Arrays.asList();
        List<String> result3 = stringFilter.filterStrings(input3, s -> s.startsWith("C"));
        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }

}
