package ru.job4j.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> gName = p -> p.getName().contains(key);
        Predicate<Person> gSurname = p -> p.getSurname().contains(key);
        Predicate<Person> gAddress = p -> p.getAddress().contains(key);
        Predicate<Person> gPhone = p -> p.getPhone().contains(key);
        Predicate<Person> combining = gName.or(gSurname).or(gAddress).or(gPhone);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combining.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
