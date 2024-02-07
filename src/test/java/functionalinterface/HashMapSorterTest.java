package functionalinterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapSorterTest {

    @Test
    void testSortHashMap() {
        HashMapSorter hashMapSorter = new HashMapSorter();

        // Test Case 1: Unsorted HashMap
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("b", 2);
        unsortedMap.put("c", 3);
        unsortedMap.put("a", 1);
        HashMap<String, Integer> sortedMap = hashMapSorter.sortHashMap(unsortedMap);
        assertEquals("{a=1, b=2, c=3}", sortedMap.toString());

        // Test Case 2: Empty HashMap
        HashMap<String, Integer> emptyMap = new HashMap<>();
        HashMap<String, Integer> sortedEmptyMap = hashMapSorter.sortHashMap(emptyMap);
        assertEquals("{}", sortedEmptyMap.toString());

        // Test Case 3: Already sorted HashMap
        HashMap<String, Integer> sortedMapInput = new HashMap<>();
        sortedMapInput.put("a", 1);
        sortedMapInput.put("b", 2);
        sortedMapInput.put("c", 3);
        HashMap<String, Integer> sortedMapOutput = hashMapSorter.sortHashMap(sortedMapInput);
        assertEquals("{a=1, b=2, c=3}", sortedMapOutput.toString());

        // Test Case 4: HashMap with duplicate values
        HashMap<String, Integer> duplicateMap = new HashMap<>();
        duplicateMap.put("b", 2);
        duplicateMap.put("c", 3);
        duplicateMap.put("a", 1);
        duplicateMap.put("d", 2);
        HashMap<String, Integer> sortedDuplicateMap = hashMapSorter.sortHashMap(duplicateMap);
        assertEquals("{a=1, b=2, d=2, c=3}", sortedDuplicateMap.toString());
    }
}
