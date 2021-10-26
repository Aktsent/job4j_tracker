package ru.job4j.tracker.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setInitials("Фамилия Имя Отчество");
        System.out.println(student.getInitials());
        student.setGroup("В43");
        System.out.println(student.getGroup());
        student.setDate("21.12.21");
        System.out.println(student.getDate());
    }
}
