package functionalinterface;

import java.util.*;

import java.util.*;

public class HashMapSorter {
    public HashMap<String, Integer> sortHashMap(HashMap<String, Integer> map) {
        // Convert HashMap entries to a List of Map.Entry objects
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list based on the values (integer) in ascending order
        entryList.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to maintain the insertion order while sorted
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        // Add sorted entries from the list to the LinkedHashMap
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
