package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task lists : list) {
            numbers.add(lists.getNumber());
        }
        return numbers;
    }
}
