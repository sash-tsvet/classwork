package ru.sbt.bit.ood.patterns;

/**
 * Created by user6 on 11.11.2016.
 */
public class MaxReducer extends AbstractReducer{
    @Override
    protected int execute(int a, int b) {
        if (a>b)return a;
        else return b;
    }
}
