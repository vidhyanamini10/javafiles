package functionalinterface;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class PalindromeTest  {
    @Test
    public void testIsPalindromeWithPalindromeNumber() {
        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(1221));
        assertTrue(Palindrome.isPalindrome(12321));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        assertFalse(Palindrome.isPalindrome(123));
        assertFalse(Palindrome.isPalindrome(12345));
        assertFalse(Palindrome.isPalindrome(1233210));
    }

    @Test
    public void testIsPalindromeWithSingleDigitNumber() {
        assertTrue(Palindrome.isPalindrome(0));
        assertTrue(Palindrome.isPalindrome(9));
    }

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        assertFalse(Palindrome.isPalindrome(-121));
    }

    @Test
    public void testIsPalindromeWithLargeNumber() {
        assertTrue(Palindrome.isPalindrome(123454321));
    }
}