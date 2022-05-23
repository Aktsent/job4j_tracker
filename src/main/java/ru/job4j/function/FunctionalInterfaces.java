package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (in, st) -> System.out.println(in + st);
        biCon.accept(map.size(), map.get(biCon));
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPred = (in, st) -> in.equals(0);
        for (Integer i : map.keySet()) {
            if (i % 2 == 0 || map.get(i).length() == 4) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = new ArrayList<>(map.values());
        System.out.println(sup.get());

        Consumer<String> con = (s) -> System.out.println();
        Function<String, String> func = (s) -> s;
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }
    }
}