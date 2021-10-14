package ru.job4j.tracker.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimetr(double a, double b, double c) {
        return -1;
    }

    public boolean exist(double ab, double ac, double bc) {
        return false;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimetr(ab, ac, bc);
            double s = sqrt(p * (p - ab) * (p - ac) * (p - bc));
            rsl = -1;
        }
        return rsl;
    }
}
