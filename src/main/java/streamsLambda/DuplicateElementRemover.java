package streamsLambda;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementRemover {

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
