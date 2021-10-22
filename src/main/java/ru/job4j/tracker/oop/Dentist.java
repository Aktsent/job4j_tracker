package ru.job4j.tracker.oop;

public class Dentist extends Doctor {

    private String pacient;

    public Dentist(String name, String surname, String education, int birthday,
                   String diagnosis, String pacient) {
        super(name, surname, education, birthday, diagnosis);
        this.pacient = pacient;
    }
}
