package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public List<Item> findById(int id) {
        return indexOf(id);
    }

    private List<Item> indexOf(int id) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getId() == id) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public List<Item> replace(int id, Item item) {
        List<Item> rsl = indexOf(id);
        rsl.set(id, item);
        return rsl;
    }

    public List<Item> delete(int id) {
        List<Item> rsl = indexOf(id);
        rsl.remove(id);
        return rsl;
    }
}