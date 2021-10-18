package ru.job4j.tracker.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest extends TestCase {

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