package ru.job4j.tracker;

import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<Item> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size()));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<Item> actions) {
        out.println("Menu:");
        for (Item item : actions) {
            out.println(item + ". " + actions);
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new DeleteIthem(output),
                new EditIthem(output),
                new FindIthemId(output),
                new FindIthemName(output),
                new ShowIthem(output),
                new ExitAction()
        );
    }
}
