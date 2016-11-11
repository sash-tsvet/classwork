package ru.sbt.bit.odd.patterns;

import org.junit.Test;
import ru.sbt.bit.ood.patterns.Reducer;
import ru.sbt.bit.ood.patterns.StrategyMultiply;
import ru.sbt.bit.ood.patterns.StrategySum;

import static org.junit.Assert.assertEquals;

public class TestReducer {

    @Test
    public void testReduceWorksAdd() {
        int[] arr = { -1, 2, 4, 0, 5 };
        StrategySum myStrategy = new StrategySum();
        assertEquals( 10, new Reducer().reduce(arr, myStrategy));
    }

    @Test
    public void testReduceWorksMulZero() {
        int[] arr = { -1, 2, 4, 0, 5 };
        StrategyMultiply myStrategy = new StrategyMultiply();
        assertEquals( 0, new Reducer().reduce(arr, myStrategy));
    }

    @Test
    public void testReduceWorksMul() {
        int[] arr = { -1, 2, 4, 5 };
        StrategyMultiply myStrategy = new StrategyMultiply();
        assertEquals( -40, new Reducer().reduce(arr, myStrategy));
    }

    @Test
    public void testReduceWorksForTwoElements() {
        int[] arr = { 1, 2 };
        StrategySum myStrategy = new StrategySum();
        assertEquals( 3, new Reducer().reduce(arr, myStrategy));
    }

    @Test
    public void testReduceWorksForOneElementAdd() {
        int[] arr = { -1 };
        StrategySum myStrategy = new StrategySum();
        assertEquals( -1, new Reducer().reduce(arr, myStrategy));
    }

    @Test
    public void testReduceWorksForOneElementMul() {
        int[] arr = { -1 };
        StrategyMultiply myStrategy = new StrategyMultiply();
        assertEquals( -1, new Reducer().reduce(arr, myStrategy));
    }

}
