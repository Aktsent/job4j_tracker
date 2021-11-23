package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println();
    }

    @Override
    public void passenger(int number) {
        System.out.println(number);
    }

    @Override
    public int refuel(int fuel) {
        int price = 5;
        return fuel * price;
    }
}
