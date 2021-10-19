package ru.job4j.tracker.oop;

public class Max {
    public static int max(int left, int right) {
        boolean condition  = left > right;
        return condition ? left : right;
    }

    public static int max(int left, int right, int up) {
        return max(left, max(right, up));
    }

    public static int max(int left, int right, int up, int down) {
        return max(left, max(right, up, down));
    }
}
