package functionalinterface;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the reversed number is equal to the original number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 12345;

        if (isPalindrome(num1)) {
            System.out.println(num1 + " is a palindrome number.");
        } else {
            System.out.println(num1 + " is not a palindrome number.");
        }

        if (isPalindrome(num2)) {
            System.out.println(num2 + " is a palindrome number.");
        } else {
            System.out.println(num2 + " is not a palindrome number.");
        }
    }
}
