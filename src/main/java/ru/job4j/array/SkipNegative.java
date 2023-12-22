package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] a : array) {
            for (int cell = 0; cell < a.length; cell++) {
                if (a[cell] < 0) {
                    a[cell] = 0;
                }
            }
        }
        return array;
    }
}
