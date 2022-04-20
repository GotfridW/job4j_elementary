package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int minimal = array[0];
        for (int index = 1; index < array.length; index++) {
            if (minimal > array[index]) {
                minimal = array[index];
            }
        }
        return minimal;
    }
}
