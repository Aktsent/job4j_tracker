package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.length(); i++) {
            for (int j = 0; j < right.length(); j++) {
                Math.min(left.length(), right.length());
                int rsl = Character.compare(left.charAt(i), right.charAt(j));
                if (rsl != 0) {
                    return rsl;
                }
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
