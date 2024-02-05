package streamsLambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeTest {

    @Test
    public void testCapitalizeFirst() {
        String[] inputStrings = {"core", "java", "programming", "language"};

        List<String> capitalizedList = Capitalize.CapitalizeFirst(inputStrings);

        // Verify that the list is not null
        assertNotNull(capitalizedList);

        // Verify the size of the list
        assertEquals(4, capitalizedList.size());

        // Verify that the strings are capitalized
        assertEquals("Core", capitalizedList.get(0));
        assertEquals("Java", capitalizedList.get(1));
        assertEquals("Language", capitalizedList.get(2));
        assertEquals("Programming", capitalizedList.get(3));

        // Verify that the list is sorted alphabetically
        List<String> sortedList = new ArrayList<>(Arrays.asList("Core", "Java", "Language", "Programming"));
        assertEquals(sortedList, capitalizedList);
    }
}
