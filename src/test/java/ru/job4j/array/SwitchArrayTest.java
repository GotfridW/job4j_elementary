package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to6() {
        int[] input = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int source = 5;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {100, 90, 80, 70, 60, 40, 50, 30, 20, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {0, 5, 10, 15, 20, 25, 30, 35, 40};
        int source = 3;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 5, 10, 25, 20, 15, 30, 35, 40};
        Assert.assertArrayEquals(expected, result);
    }
}