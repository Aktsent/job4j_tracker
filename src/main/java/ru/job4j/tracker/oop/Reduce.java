package ru.job4j.tracker.oop;

public class Reduce {
    private int[] array;

    public void to(int[] array1) {
        array = array1;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
