package com.nghianv.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    public static void main(String[] args) {
        Map<String, Student> hashMap = new HashMap<>();
        hashMap.put("1", new Student("A", 12, "Ha Noi"));
        hashMap.put(null, new Student("C", 13, "Ha Noi"));
        hashMap.put("2", null);
        hashMap.put("4", new Student("D", 14, "Ha Nam"));
        //show hashMap
        show(hashMap);

    }

    public static void show(Map<String, Student> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + "- " + map.get(key));
        }

    }
}
