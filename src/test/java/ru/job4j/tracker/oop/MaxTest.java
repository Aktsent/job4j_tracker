package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void testMax3() {
        int left = 1;
        int right = 3;
        int up = 9;
        int rsl = Max.max(left, right, up);
        int exp = 9;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void testMax() {
        int left = 1;
        int right = 2;
        int up = 3;
        int down = 5;
        int rsl = Max.max(left, right, up, down);
        int exp = 5;
        Assert.assertEquals(exp, rsl);
    }
}