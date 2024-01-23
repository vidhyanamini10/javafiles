package strings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if one string is a rotation of another
        boolean result = isRotation(str1, str2);

        // Display the result
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if one string is a rotation of another
    private static boolean isRotation(String s1, String s2) {
        // Check if lengths are equal and not empty
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        // Concatenate s1 with itself and check if s2 is a substring
        String concatenatedString = s1 + s1;
        return concatenatedString.contains(s2);
    }
}
