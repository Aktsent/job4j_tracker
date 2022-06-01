package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Fun.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunction() {
        List<Double> result = Fun.diapason(5, 8, x -> x * x + 3);
        List<Double> expected = Arrays.asList(28D, 39D, 52D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenDemonstrationFunction() {
        List<Double> result = Fun.diapason(5, 8, x -> Math.pow(3, x));
        List<Double> expected = Arrays.asList(243D, 729D, 2187D);
        assertThat(result, is(expected));
    }
}