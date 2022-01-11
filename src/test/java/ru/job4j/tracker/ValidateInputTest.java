package ru.job4j.tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(0));
    }

    @Test
    public void whenManyInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"1", "0", "2"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(1));
        int selected1 = input.askInt("Enter menu");
        assertThat(selected1, is(0));
        int selected2 = input.askInt("Enter menu");
        assertThat(selected2, is(2));
    }

    @Test
    public void whenMinusInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(-1));
    }
}