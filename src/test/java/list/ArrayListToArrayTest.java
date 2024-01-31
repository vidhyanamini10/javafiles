package list;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArrayListToArrayTest {

    ArrayListToArray arrL2Arr;

    @Before
    public void setUp()  {
        arrL2Arr = new ArrayListToArray();
    }

    @Test
    public void testArrayListtoArray() {
        ArrayList<String> arL = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        String[] stringArray = {"a", "b", "c", "d"};
        assertEquals(arrL2Arr.ArrayListtoArray(arL), stringArray);
    }

    @Test
    public void testArrayListtoArrayFalse() {
        ArrayList<String> arL = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        String[] stringArray = {"a", "b", "c"};
        assertNotEquals(arrL2Arr.ArrayListtoArray(arL), stringArray);
    }
}