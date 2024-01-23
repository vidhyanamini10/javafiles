package strings;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the function to count vowels
        int vowelCount = countVowels(inputString);

        // Display the result
        System.out.println("Number of vowels in the given string: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count vowels in a string
    private static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
