package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when95to74then5() {
            double expected = 5;
            int x1 = 9;
            int y1 = 7;
            int x2 = 5;
            int y2 = 4;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when38to29then1dot41() {
        double expected = 1.41;
        int x1 = 3;
        int y1 = 8;
        int x2 = 2;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to89then12dot04() {
        double expected = 12.04;
        int x1 = 0;
        int y1 = 0;
        int x2 = 8;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}