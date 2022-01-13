package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    private int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(5) + multiply(8) + minus(5) + divide(9);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl1 = minus(7);
        int rsl2 = calculator.divide(10);
        int rsl3 = calculator.sumAllOperation(8);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
    }
}
