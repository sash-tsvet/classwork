package com.hacker.reduce;

import ru.sbt.bit.ood.patterns.ReduceOperation;
import ru.sbt.bit.ood.patterns.Reducer;

/**
 * Created by user6 on 11.11.2016.
 */
public class SuperMagicReduceOperationAdapter implements ReduceOperation {
    @Override
    public int reduce(int x, int y) {
        return new SuperMagicReduceOperation().doTheMagic(x,y, new ReduceSettings(ReduceMode.EXACT));
    }
}
