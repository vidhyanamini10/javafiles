package functionalinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseConverterTest {

    @Test
    void testConvertCase() {
        CaseConverter caseConverter = new CaseConverter();

        // Test Case 1: Lower-case input
        String lowerCaseInput = "hello world";
        String expectedUpperCaseOutput = "HELLO WORLD";
        assertEquals(expectedUpperCaseOutput, caseConverter.convertCase(lowerCaseInput));

        // Test Case 2: Upper-case input
        String upperCaseInput = "HELLO WORLD";
        String expectedLowerCaseOutput = "hello world";
        assertEquals(expectedLowerCaseOutput, caseConverter.convertCase(upperCaseInput));

        // Test Case 3: Mixed-case input
        String mixedCaseInput = "Hello World";
        String expectedMixedCaseOutput = "hELLO wORLD";
        assertEquals(expectedMixedCaseOutput, caseConverter.convertCase(mixedCaseInput));

        // Test Case 4: Empty input
        String emptyInput = "";
        String expectedEmptyOutput = "";
        assertEquals(expectedEmptyOutput, caseConverter.convertCase(emptyInput));
    }
}
