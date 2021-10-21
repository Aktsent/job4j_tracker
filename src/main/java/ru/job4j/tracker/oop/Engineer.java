package ru.job4j.tracker.oop;

public class Engineer extends Profession {

    private int experience;

    public Engineer() {
    }

    public Engineer(int experience) {
        this.experience = experience;
    }

    public int getExperience(int experience) {
        return experience;
    }
}
