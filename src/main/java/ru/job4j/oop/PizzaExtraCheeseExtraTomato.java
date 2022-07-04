package ru.job4j.oop;

public class PizzaExtraCheeseExtraTomato  extends PizzaExtraCheese {
    public String name() {
        return super.name() + " + Extra Tomato";
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }

}
