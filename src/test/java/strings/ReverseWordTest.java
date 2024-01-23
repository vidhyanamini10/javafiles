package strings;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordTest  {

    @Test
    public void testMain() {
        String str1 = "Hello";
        String str2 = "olleH";

        //String actual = ReverseWord.reverseEachWord(str1);
        assertEquals(str2, ReverseWord.reverseEachWord(str1));
    }
    @Test
    public void testWithEmptyValue(){
        String str1 = "";
        String str2 ="";
        assertEquals(str2,ReverseWord.reverseEachWord(str1));
    }
    @Test
    public void test3() {
        boolean cond = false;


        if(ReverseWord.reverseEachWord("Hello World").equals("olleH dlroW") )
        {
         cond = true;
        }
        else{
            cond = false;
        }
        assertTrue(cond);

    }


}