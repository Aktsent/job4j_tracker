package ru.job4j.tracker.oop;

public class Programmer extends Engineer {
    private Engineer programm;

    public Engineer getProgramm(Engineer programm) {
        this.programm = programm;
        return programm;
    }

}
