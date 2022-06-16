package ru.job4j.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Object> find(String key) {
        Predicate<Person> gName = p -> p.getName().contains(key);
        Predicate<Person> gSurname = p -> p.getSurname().contains(key);
        Predicate<Person> gAddress = p -> p.getAddress().contains(key);
        Predicate<Person> gPhone = p -> p.getPhone().contains(key);
        var combining = gName.or(gSurname).or(gAddress).or(gPhone);
        var result = new ArrayList<>();
        for (var person : persons) {
            if (combining.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
