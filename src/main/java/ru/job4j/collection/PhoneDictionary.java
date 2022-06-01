package ru.job4j.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = p -> p.getName().contains(key);
        Predicate<Person> combine2 = p -> p.getSurname().contains(key);
        Predicate<Person> combine3 = p -> p.getAddress().contains(key);
        Predicate<Person> combine4 = p -> p.getPhone().contains(key);
        Predicate<Person> combining = combine.or(combine2).or(combine3).or(combine4);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combining.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
