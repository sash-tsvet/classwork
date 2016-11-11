package ru.sbt.bit.ood.patterns;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user6 on 11.11.2016.
 */
public class MulReducerTest extends TestCase {
    @Test
    public void testReduceOneElem() throws Exception {
        int[] arr = { -1 };
        assertEquals( -1, new MulReducer().reduce(arr));
    }

    @Test
    public void testReduce() throws Exception {
        int[] arr = {-1, 2, 4, 5};
        assertEquals(-40, new MulReducer().reduce(arr));
    }
}