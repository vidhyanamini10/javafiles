package functionalinterface;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class CharacterTest extends TestCase {
    @Test
        public void testIdentifyAndPrintRepeated() {
            System.out.println("Test Case 1:");
            Character.identifyAndPrintRepeated("programming");

            System.out.println("\nTest Case 2:");
            Character.identifyAndPrintRepeated("java");

            System.out.println("\nTest Case 3:");
            Character.identifyAndPrintRepeated("hello");

            // Testing exception for null input
            try {
                Character.identifyAndPrintRepeated(null);
                fail("Expected IllegalArgumentException for null input.");
            } catch (IllegalArgumentException e) {
                // Expected exception
            }
        }

}