package ru.sbt.bit.ood.patterns;

/**
 * Created by user6 on 11.11.2016.
 */
public class StrategyMultiply implements Strategy {
    @Override
    public int execite(int a, int b) {
        return a*b;
    }
}
