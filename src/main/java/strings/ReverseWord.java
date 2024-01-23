import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Call the function to reverse each word
        String reversedSentence = reverseEachWord(inputSentence);

        // Display the result
        System.out.println("Reversed Sentence: " + reversedSentence);

        // Close the scanner
        scanner.close();
    }

    // Function to reverse each word in a sentence
    private static String reverseEachWord(String sentence) {
        String[] words = sentence.split("\\s"); // Split the sentence into words
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through each word, reverse it, and append to the result
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim(); // Remove trailing space
    }
}

