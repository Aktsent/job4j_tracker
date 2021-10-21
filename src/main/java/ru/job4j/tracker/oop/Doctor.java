package ru.job4j.tracker.oop;

public class Doctor extends Profession {

    private String diagnosis;

    public Doctor() {
    }

    public Doctor(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(String diagnosis) {
        return diagnosis;
    }
}
