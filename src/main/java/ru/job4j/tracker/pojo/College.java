package ru.job4j.tracker.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setInitials("Фамилия Имя Отчество");
        student.getInitials();
        student.setGroup("В43");
        student.getGroup();
        student.setDate("21.21.21");
        student.getDate();
    }
}
