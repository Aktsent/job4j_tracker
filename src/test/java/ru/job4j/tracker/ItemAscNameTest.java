package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemAscNameTest {

    @Test
    public void itemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Impl task"),
                new Item("Fix bugs"),
                new Item("Reboot server")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Fix bugs"),
                new Item("Impl task"),
                new Item("Reboot server")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void itemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Impl task"),
                new Item("Fix bugs"),
                new Item("Reboot server")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Reboot server"),
                new Item("Impl task"),
                new Item("Fix bugs")
        );
        assertThat(items, is(expected));
    }
}