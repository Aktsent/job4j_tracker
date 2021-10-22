package ru.job4j.tracker.oop;

public class Programmer extends Engineer {

    private String programm;

    public Programmer(String name, String surname, String education, int birthday,
                      int experience, String programm) {
        super(name, surname, education, birthday, experience);
        this.programm = programm;
    }

}
