package functionalinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatDigitsFinder {
    public List<Integer> findRepeatedDigits(int number) {
        // Convert the number to a string for easier digit extraction
        String numString = String.valueOf(number);

        // Create a Set to store unique digits
        Set<java.lang.Character> uniqueDigits = new HashSet<>();

        // Create a List to store repeated digits
        List<Integer> repeatedDigits = new ArrayList<>();

        // Iterate through each digit in the number
        for (char digit : numString.toCharArray()) {
            // Check if the digit is already present in the Set
            if (!uniqueDigits.add(digit)) {
                // If not, add it to the repeatedDigits List
                repeatedDigits.add(Character.getNumericValue(digit));
            }
        }

        return repeatedDigits;
    }
}

