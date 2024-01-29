package map;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;



public class CharacterCounterTest {

    @Test
    public void testPrintCharacterCounts() {
        // Redirecting System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test case 1: Normal input
        String input1 = "test string";
        CharacterCounter.printCharacterCounts(input1);
        assertEquals("t-3\ne-1\ns-2\nr-1\ni-1\nn-1\ng-1\n", outContent.toString());

        // Test case 2: Empty input
        String input2 = "";
        CharacterCounter.printCharacterCounts(input2);
        assertEquals("", outContent.toString());

        // Test case 3: Input with spaces
        String input3 = "hello world";
        CharacterCounter.printCharacterCounts(input3);
        assertEquals("h-1\ne-1\nl-3\no-2\n -1\nw-1\nr-1\nd-1\n", outContent.toString());

        // Resetting System.out to the original PrintStream
        System.setOut(System.out);
    }
}

