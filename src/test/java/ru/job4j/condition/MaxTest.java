package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To13Then13() {
        int left = 5;
        int right = 13;
        int result = Max.max(left, right);
        int expected = 13;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}