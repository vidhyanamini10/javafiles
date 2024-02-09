package streamsLambda;


    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    public class Addition {

        public int performAddition(int a, int b) {
            MathOperation addition = (x, y) -> x + y;
            return addition.operate(a, b);
        }
    }


