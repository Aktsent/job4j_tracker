package ru.job4j.tracker.oop;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertEquals(2, dist, 0.01);
    }
}