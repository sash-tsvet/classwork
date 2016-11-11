package ru.sbt.bit.odd.patterns;

import com.hacker.reduce.SuperMagicReduceOperationAdapter;
import org.junit.Test;
import ru.sbt.bit.ood.patterns.Reducer;
import ru.sbt.bit.ood.patterns.SumReduceOp;

import static org.junit.Assert.assertEquals;

public class TestReducer {

    @Test
    public void testReduceWorks() {
        int[] arr = { -1, 2, 4, 0, 5 };
        assertEquals( 10, new Reducer().reduce(arr, new SuperMagicReduceOperationAdapter()));
    }

    @Test
    public void testReduceWorksForTwoElements() {
        int[] arr = { 1, 2 };
        assertEquals( 3, new Reducer().reduce(arr, new SuperMagicReduceOperationAdapter()));
    }

    @Test
    public void testReduceWorksForOneElement() {
        int[] arr = { -1 };
        assertEquals( -1, new Reducer().reduce(arr, new SuperMagicReduceOperationAdapter()));
    }

}
