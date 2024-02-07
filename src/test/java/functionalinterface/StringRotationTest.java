package functionalinterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringRotationTest {

    @Test
    void testRotation() {
        StringRotation stringRotation = new StringRotation();

        // Test Case 1: Rotated string
        assertTrue(stringRotation.isRotation("abcd", "cdab"));

        // Test Case 2: Not a rotation (unequal lengths)
        assertFalse(stringRotation.isRotation("abcde", "cde"));

        // Test Case 3: Not a rotation (empty strings)
        assertFalse(stringRotation.isRotation("", "cdab"));

        // Test Case 4: Not a rotation (different strings)
        assertFalse(stringRotation.isRotation("abcd", "efgh"));


    }
}
