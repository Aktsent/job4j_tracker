package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public void passenger(int number) {
    }

    @Override
    public int refuel(int fuel) {
        int price = 5;
        return price;
    }
}
