package ru.sbt.bit.ood.patterns;

/**
 * Created by user6 on 11.11.2016.
 */
public class SumReducer extends AbstractReducer {
    @Override
    protected int execute(int a, int b) {
        return a+b;
    }
}
