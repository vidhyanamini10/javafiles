package strings;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class AnagramTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testMain() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        assertTrue(AnagramTest.isRotation(str1, str2));
    }

    public void testWithEmptyString(){
        String str1 = "";
        String str2 = "";
        assertTrue(AnagramTest.isRotation(str1,str2));
    }
    public void testWithSingleChar(){
        String str1= "a";
        String str2= "a";
        assertTrue(AnagramTest.isRotation(str1,str2));
    }
    public void testAreRotations_False() {
        String str1 = "HelloWorld";
        String str2 = "WorldHello";
        assertFalse(AnagramTest.isRotation(str1, str2));
    }

    private static boolean isRotation(String str1, String str2) {
        return true;
    }
}