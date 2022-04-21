package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] char1 = new char[left.length()];
        char[] char2 = new char[right.length()];
        for (int i = 0; i < left.length(); i++) {
            for (int j = 0; j < right.length(); j++) {
                char1[i] = left.charAt(i);
                char2[j] = right.charAt(j);
                Character.compare(char1[i], char2[j]);
            }
        }
        return 0;
    }
}
