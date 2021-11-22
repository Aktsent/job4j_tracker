package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        String driver = "Ivanov";
        System.out.println(driver);
    }

    @Override
    public void passenger(int number) {
        int seat = 20;
        int free = number / seat;
        System.out.println(free);
    }

    @Override
    public int refuel(int fuel) {
        int price = 5;
        return fuel * price;
    }
}
