package map;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public Map<Character, Integer> printCharacterCounts(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting occurrences of each character
        for (char c : input.toCharArray()) {
            if(c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Printing distinct characters and their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        return charCountMap;
    }
}