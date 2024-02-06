package streamsLambda;

import java.util.Arrays;

public class VowelsCount {
    public static void vowels_count(String[] arr){

//
        Arrays.stream(arr)
                .filter(str -> containsVowels(str))
                .forEach(str -> {
                    System.out.println("Word: " + str);
                    System.out.println("Number of Vowels: " + countVowels(str));
                    System.out.println();
                });
    }

    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static long countVowels(String str) {
        return str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }

    public static void main(String[] args) {

        VowelsCount.vowels_count(new String[]{"Vidhya","Namini"});
    }
}
