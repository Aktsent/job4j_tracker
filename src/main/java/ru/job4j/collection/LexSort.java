package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        String[] lf = left.split(". ");
        String[] rg = right.split(". ");
        for (String l : lf) {
            for (String r : rg) {
                int rsl = Integer.compare(Integer.parseInt(l), Integer.parseInt(r));
                if (rsl != 0) {
                    return rsl;
                }
            }
        }
        return left.compareTo(right);
    }
}
