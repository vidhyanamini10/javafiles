package streamsLambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class StringLengthTest {
    @Test
    public void testGroupByLength() {
        StringLength grouper = new StringLength();

        // Test Case 1: Normal case with multiple strings of different lengths
        List<String> input1 = Arrays.asList("apple", "banana", "orange", "pear", "kiwi");
        Map<Integer, List<String>> expected1 = new HashMap<>();
        expected1.put(5, Arrays.asList("apple", "pear"));
        expected1.put(6, Arrays.asList("banana", "orange"));
        expected1.put(4, Arrays.asList("kiwi"));
        Map<Integer, List<String>> result1 = grouper.groupByLength(input1);
        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Single string in the list
        List<String> input2 = Arrays.asList("elephant");
        Map<Integer, List<String>> expected2 = new HashMap<>();
        expected2.put(8, Arrays.asList("elephant"));
        Map<Integer, List<String>> result2 = grouper.groupByLength(input2);
        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Empty list
        List<String> input3 = Arrays.asList();
        Map<Integer, List<String>> expected3 = new HashMap<>();
        Map<Integer, List<String>> result3 = grouper.groupByLength(input3);
        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }

}
