package streamsLambda;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringSortTest {
 @Test
    public void testSortStrings() {
        // Test Case 1: Strings with different lengths
        String[] input1 = {"abc", "de", "fghi", "jk"};
        String[] expected1 = {"jk", "de", "abc", "fghi"};
        String[] result1 = StringSort.sortStrings(input1);
        System.out.println(Arrays.equals(result1, expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Strings with same lengths and same last characters
        String[] input2 = {"aa", "bb", "cc"};
        String[] expected2 = {"bb", "cc", "aa"};
        String[] result2 = StringSort.sortStrings(input2);
        System.out.println(Arrays.equals(result2, expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Strings with same lengths and different last characters
        String[] input3 = {"xy", "xz", "xx"};
        String[] expected3 = {"xz", "xx", "xy"};
        String[] result3 = StringSort.sortStrings(input3);
        System.out.println(Arrays.equals(result3, expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
    }
}