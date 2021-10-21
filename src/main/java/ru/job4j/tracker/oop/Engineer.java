package ru.job4j.tracker.oop;

public class Engineer extends Profession {

    private int experience;

    public int getExperience(int experience) {
        this.experience = experience;
        return experience;
    }
}
