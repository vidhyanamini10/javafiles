package strings;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringRotationTest  {

    @Test
    public void test1() {
        String str1="JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        assertTrue(StringRotation.isRotation(str1,str2));
    }
    @Test
    public void test2(){
        String str1 = "abc";
        String str2 = "cba";
        assertFalse(StringRotation.isRotation(str1,str2));
    }
}