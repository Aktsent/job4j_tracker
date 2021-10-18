package ru.job4j.tracker.oop;

public class Max {
    public static int max(int left, int right) {
        boolean condition  = left > right;
        return condition ? left : right;
    }

    public static int max(int left, int right, int up) {
        int tmp1 = max(right, up);
        return max(left, tmp1);
    }

    public static int max(int left, int right, int up, int down) {
        int tmp2 = max(right, up, down);
        return max(left, tmp2);
    }
}
