package ru.job4j.collection.map;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void duple() {
        Citizen citizen = new Citizen("123", "Name Surname");
        Citizen citizen1 = new Citizen("123", "Name1 Surname1");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen1);
        assertFalse(office.add(citizen1));
    }
}