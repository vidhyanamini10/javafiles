package streamsLambda;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

