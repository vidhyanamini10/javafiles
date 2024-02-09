package streamsLambda;

import java.util.Arrays;
import java.util.Comparator;
public class StringSort {
    public static String[] sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing((s1, s2) -> {
                    int lengthDiff = s1.length() - s2.length();
                    return (lengthDiff == 0) ? Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1)) : lengthDiff;
                }));
        return strings;
    }

}
