package strings;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {


    @Test
    public void testMain() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        assertTrue(Anagram.areAnagrams(str1, str2));
    }
    @Test
    public void testWithEmptyString(){
        String str1 = "";
        String str2 = "";
        assertTrue(Anagram.areAnagrams(str1,str2));
    }
    @Test
    public void testWithSingleChar(){
        String str1= "a";
        String str2= "a";
        assertTrue(Anagram.areAnagrams(str1,str2));
    }
    @Test
    public void testAreRotations_False() {
        String str1 = "HelloWorld";
        String str2 = "WorldrrrrrHello";
        assertFalse(Anagram.areAnagrams(str1, str2));
    }


}
