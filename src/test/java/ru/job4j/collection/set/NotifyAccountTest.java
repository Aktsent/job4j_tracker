package ru.job4j.collection.set;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void notDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "First", "sn123"),
                new Account("232", "Second", "as456"),
                new Account("123", "First", "sn123")
        );
        HashSet<Account> expected = new HashSet<>(
                Arrays.asList(
                        new Account("123", "First", "sn123"),
                        new Account("232", "Second", "as456")
                        )
                );
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }
}