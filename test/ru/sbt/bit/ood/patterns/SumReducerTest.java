package ru.sbt.bit.ood.patterns;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user6 on 11.11.2016.
 */
public class SumReducerTest extends TestCase {
    @Test
    public void testReduce() throws Exception {
        int[] arr = { -1, 2, 4, 0, 5 };
        assertEquals( 10, new SumReducer().reduce(arr));
    }

}