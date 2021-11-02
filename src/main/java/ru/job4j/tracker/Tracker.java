package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] item = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item array = items[i];
            if (array != null) {
                item[size] = array;
                size++;
            }
        }
        item = Arrays.copyOf(item, size);
        return item;
    }

    public Item[] findByName(String key) {
        Item[] item = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item array = items[i];
            if (array.getName().equals(key)) {
                item[i] = array;
            }
        }
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}