package streamsLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Capitalize {
    public static List<String> CapitalizeFirst(String[] args) {
        String[] strings = {"core", "java", "programming", "language"};

        return Arrays.stream(strings).map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted() // printing the strings in alphabatical order
                .collect(Collectors.toList());
    }

}
