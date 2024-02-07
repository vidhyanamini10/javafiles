package functionalinterface;

import java.util.HashMap;

public class WordCounter {
    public HashMap<String, Integer> countUniqueWords(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the words and update the word count
        for (String word : words) {
            // Remove punctuation and convert to lowercase for consistency
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Increment the count for the current word
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}

