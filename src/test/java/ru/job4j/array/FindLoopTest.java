package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {3, 6, 9, 12, 15};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas40Then3() {
        int[] data = {10, 20, 30, 40, 50};
        int el = 40;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas2ThenMinus1() {
        int[] data = {-10, -5, 0, 5, 10};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

        @Test
        public void whenDiapasonHasNot8ThenMinus1() {
            int[] data = new int[] {0, 5, 10, 15, 20, 25};
            int el = 8;
            int start = 0;
            int finish = 3;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = -1;
            Assert.assertEquals(expected, result);
        }
}