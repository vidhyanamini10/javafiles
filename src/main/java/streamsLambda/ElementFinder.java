package streamsLambda;

import java.util.List;
import java.util.Optional;

public class ElementFinder {

    public Optional<String> findMaximumElement(List<String> strings) {
        return strings.stream()
                .max(String::compareTo);
    }
}

