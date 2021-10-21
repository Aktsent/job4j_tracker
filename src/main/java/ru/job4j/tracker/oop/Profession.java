package ru.job4j.tracker.oop;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public String getSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    public String getEducation(String education) {
        this.education = education;
        return education;
    }

    public int getBirthday(int birthday) {
        this.birthday = birthday;
        return birthday;
    }
}

