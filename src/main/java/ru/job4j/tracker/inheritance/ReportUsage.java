package ru.job4j.tracker.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("name : name,", "body : body");
        System.out.println("{" + text + "}");
    }
}
