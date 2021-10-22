package ru.job4j.tracker.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return System.lineSeparator() + name + System.lineSeparator() + body
                + System.lineSeparator();
    }
}
