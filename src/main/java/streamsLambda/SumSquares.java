package streamsLambda;

import java.util.List;

public class SumSquares {

    public int calculateSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(n -> n * n)
                .sum();
    }
}
