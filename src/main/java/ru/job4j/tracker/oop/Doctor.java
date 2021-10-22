package ru.job4j.tracker.oop;

public class Doctor extends Profession {

    private String diagnosis;

    public Doctor(String name, String surname, String education, int birthday, String diagnosis) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(String diagnosis) {
        return diagnosis;
    }
}
