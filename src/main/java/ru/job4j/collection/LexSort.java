package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(Integer.parseInt(left.split(" ")), Integer.parseInt(right.split(" ")));
    }
}