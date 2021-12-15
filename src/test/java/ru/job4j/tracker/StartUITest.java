package ru.job4j.tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(new String[] {"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        UserAction[] actions = {new CreateAction(output), new ExitAction()};
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()),
                "New item name", "1"});
        UserAction[] actions = {new EditIthem(output), new ExitAction()};
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new DeleteIthem(output), new ExitAction()};
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindIthemId() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("one"));
        Item find = tracker.findById(one.getId());
        Input in = new StubInput(new String[] {"0", String.valueOf(find.getId()), "1"});
        UserAction[] actions = new UserAction[] {
                new FindIthemId(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                + "0. Find item by id" + ln
                + "1. Exit Program" + ln
                + "=== Find item by id ===" + ln
                + find + ln
                + "Menu:" + ln
                + "0. Find item by id" + ln
                + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindIthemName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("one"));
        Item[] find = tracker.findByName(one.getName());
        Input in = new StubInput(new String[] {"0", String.valueOf(find.length), "1"});
        UserAction[] actions = new UserAction[] {
                new FindIthemName(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + find + ln
                        + "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenShowIthem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item[] show = tracker.findAll();
        Input in = new StubInput(new String[] {"0", String.valueOf(show.length), "1"});
        UserAction[] actions = new UserAction[] {
                new ShowIthem(out),
                new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + show.length + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
        ));
    }
}