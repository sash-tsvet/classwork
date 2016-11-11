package ru.sbt.bit.ood.patterns;

public class Reducer {

    public int reduce(int[] arr, Strategy strategy) {
        if (arr.length == 1) return arr[0];
        int[] reduced = new int[arr.length/2 + arr.length%2];
        for (int i = 0;i < arr.length/2;i++) {
            reduced[i] = strategy.execite(arr[i*2], arr[i*2+1]);
        }
        if (arr.length % 2 == 1) {
            reduced[reduced.length-1] = arr[arr.length-1];
        }
        return reduce(reduced, strategy);
    }

}
