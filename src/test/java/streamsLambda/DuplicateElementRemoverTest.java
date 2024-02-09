package streamsLambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class DuplicateElementRemoverTest {
    @Test
    public void testRemoveDuplicates() {
        DuplicateElementRemover remover = new DuplicateElementRemover();

        // Test Case 1: Normal case with duplicate elements
        List<Integer> input1 = Arrays.asList(1, 2, 3, 2, 4, 3);
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> result1 = remover.removeDuplicates(input1);
        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: No duplicate elements
        List<Integer> input2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> result2 = remover.removeDuplicates(input2);
        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Empty list
        List<Integer> input3 = Arrays.asList();
        List<Integer> expected3 = Arrays.asList();
        List<Integer> result3 = remover.removeDuplicates(input3);
        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }

}
