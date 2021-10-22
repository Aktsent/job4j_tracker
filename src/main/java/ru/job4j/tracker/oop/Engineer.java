package ru.job4j.tracker.oop;

public class Engineer extends Profession {

    private int experience;

    public Engineer(String name, String surname, String education, int birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public int getExperience(int experience) {
        return experience;
    }
}
