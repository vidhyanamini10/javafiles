package list;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ListTraversalTest {

    ListTraversal listTraversal;

    @Before
    public void setUp()  {
        listTraversal = new ListTraversal();
    }

    @Test
    public void testListTraversal() {
        ListTraversal.stringList.addAll(Arrays.asList("a", "b", "c", "d"));
        assertDoesNotThrow(()->listTraversal.Traverse(ListTraversal.stringList));
    }

    @Test
    public void testNullListTraversal() {
        ListTraversal.stringList = null;
        assertDoesNotThrow(()->listTraversal.Traverse(ListTraversal.stringList));
    }
}