package list;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveListTest{
    public RemoveList rL;
    @Before
    public void setUp() {
        rL = new RemoveList();
    }

    @Test
    public void testRemoveLastElement() {
        RemoveList.stringList.addAll(Arrays.asList("a", "b", "c", "d"));
        rL.RemoveLastElement(RemoveList.stringList);
        ArrayList<String> output = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(RemoveList.stringList, output);
    }

    @Test
    public void testRemoveLastElementFalse() {
        RemoveList.stringList.addAll(Arrays.asList("a", "b", "c", "d"));
        rL.RemoveLastElement(RemoveList.stringList);
        ArrayList<String> output = new ArrayList<>(Arrays.asList("a", "b" , "d"));
        assertNotEquals(RemoveList.stringList, output);
    }

    @Test
    public void testRemoveLastElementNull() {
        rL.RemoveLastElement(RemoveList.stringList);
        assertEquals(RemoveList.stringList.size(),0);
    }
}