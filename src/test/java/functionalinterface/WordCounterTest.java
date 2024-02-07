package functionalinterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {
    @Test
    void testSingleWord() {
        WordCounter wordCounter = new WordCounter();
        HashMap<String, Integer> result = wordCounter.countUniqueWords("hello");
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        assertEquals(expected, result);
    }

    @Test
    void testMultipleWordsWithDuplicates() {
        WordCounter wordCounter = new WordCounter();
        HashMap<String, Integer> result = wordCounter.countUniqueWords("hello world hello");
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, result);
    }

    @Test
    void testCaseSensitivity() {
        WordCounter wordCounter = new WordCounter();
        HashMap<String, Integer> result = wordCounter.countUniqueWords("Hello World hello");
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, result);
    }

    @Test
    void testWordsWithPunctuation() {
        WordCounter wordCounter = new WordCounter();
        HashMap<String, Integer> result = wordCounter.countUniqueWords("hello, world! hello?");
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        assertEquals(expected, result);
    }
}
