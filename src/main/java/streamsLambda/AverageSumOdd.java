package streamsLambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Given an array of Integers, write a program to find the average of squares of all the odd numbers.
public class AverageSumOdd{

    public static double avgSquares(int[] arr){
        IntStream st= Arrays.stream(arr);
        int sum = st.filter(num->num%2!=0).map(num->num*num).sum();
        System.out.println(sum);
        IntStream st1= Arrays.stream(arr);
        int count = (int) st1.filter(num->num%2!=0).count();
        System.out.println(count);
        return (double)sum/count;
    }

    public static void main(String[] args) {
        System.out.println( AverageSumOdd.avgSquares(new int[]{1, 1,1,1, 3}));

        System.out.println( AverageSumOdd.avgSquares(new int[]{1, 2, 3, 4, 5, 6, 7,9,3,1}));
    }
}
