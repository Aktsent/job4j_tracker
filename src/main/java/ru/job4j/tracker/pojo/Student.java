package ru.job4j.tracker.pojo;

public class Student {
    private String initials;
    private String group;
    private String date;

    public String getInitials() {
        System.out.println(initials);
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getGroup() {
        System.out.println(group);
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        System.out.println(date);
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
