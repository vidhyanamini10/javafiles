package functionalinterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class RepeatedDigitsFinderTest {

    @Test
    void testRepeatedDigits() {
        RepeatDigitsFinder repeatedDigitsFinder = new RepeatDigitsFinder();

        // Test Case 1: Repeated digits in the middle
        assertEquals(Arrays.asList(3, 4), repeatedDigitsFinder.findRepeatedDigits(123344567));

        // Test Case 2: Repeated digits at the end
        assertEquals(Arrays.asList(7, 8), repeatedDigitsFinder.findRepeatedDigits(123456788));

        // Test Case 3: Repeated digits at the beginning
        assertEquals(Arrays.asList(1, 2), repeatedDigitsFinder.findRepeatedDigits(112345678));


    }
}
