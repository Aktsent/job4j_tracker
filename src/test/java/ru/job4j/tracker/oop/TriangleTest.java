package ru.job4j.tracker.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import ru.job4j.oop.Point;
import ru.job4j.oop.Triangle;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void areanot() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = -1;
        assertThat(rsl, closeTo(-1, 0.001));
    }
}