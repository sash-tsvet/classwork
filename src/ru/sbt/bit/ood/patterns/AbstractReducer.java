package ru.sbt.bit.ood.patterns;

/**
 * Created by user6 on 11.11.2016.
 */
public abstract class AbstractReducer {
    public int reduce(int[] arr) {
        if (arr.length == 1) return arr[0];
        int[] reduced = new int[arr.length/2 + arr.length%2];
        for (int i = 0;i < arr.length/2;i++) {
            reduced[i] = execute(arr[i*2], arr[i*2+1]);
        }
        if (arr.length % 2 == 1) {
            reduced[reduced.length-1] = arr[arr.length-1];
        }
        return reduce(reduced);
    }

    protected abstract int execute (int a,int b);
}
