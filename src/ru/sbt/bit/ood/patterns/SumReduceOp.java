package ru.sbt.bit.ood.patterns;

public class SumReduceOp implements ReduceOperation {

    @Override
    public int reduce(int x, int y) {
        return x + y;
    }

}
