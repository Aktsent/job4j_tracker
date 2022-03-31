package ru.job4j.collection.map;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mail@mail.com", "FirstName LastName");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}
