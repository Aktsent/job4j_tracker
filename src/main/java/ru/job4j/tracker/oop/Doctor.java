package ru.job4j.tracker.oop;

public class Doctor extends Profession {

    private String diagnosis;

    public String getDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        return diagnosis;
    }
}
