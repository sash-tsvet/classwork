package ru.sbt.bit.ood.patterns;

public class Reducer {

    public int reduce(int[] arr, ReduceOperation op) {
        if (arr.length == 1) return arr[0];
        int[] reduced = new int[arr.length/2 + arr.length%2];
        for (int i = 0;i < arr.length/2;i++) {
            int x = arr[i * 2];
            int y = arr[i * 2 + 1];
            reduced[i] = op.reduce(x,y);
        }
        if (arr.length % 2 == 1) {
            reduced[reduced.length-1] = arr[arr.length-1];
        }
        return reduce(reduced, op);
    }

}
