package strings;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsTest {

    @Test
    public void test1() {
        String str1 = "vidhya";
        assertEquals(2,Vowels.countVowels(str1));
    }
    @Test
    public void test2(){
        String str1 ="";
        assertEquals(0,Vowels.countVowels(str1));
    }
    @Test
    public void test3(){
        String str1="qwrty";
        assertEquals(0,Vowels.countVowels(str1));
    }
}