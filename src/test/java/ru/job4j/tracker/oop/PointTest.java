package ru.job4j.tracker.oop;

import org.junit.Test;
import ru.job4j.oop.Point;

import static junit.framework.Assert.assertEquals;

public class PointTest {

    @Test
    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertEquals(2, dist, 0.01);
    }

    @Test
    public void testDistance3d() {
        Point a = new Point(0, 0, 5);
        Point b = new Point(0, 2, 6);
        double dist = a.distance3d(b);
        assertEquals(2.23, dist, 0.01);
    }
}