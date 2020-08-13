package com.nghianv.model;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("J", "Java");
        map.put("C", "C");
        map.put("P", "PHP");
        map.put("Py", "Python");
        //show HashMap
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        // truy cap phan tu hashMap
        System.out.println("Phan tu co key = J la : " + map.get("J"));
        System.out.println("Phan tu co key  = C la :" + map.get("C"));
        //Cap nhap gia tri cua phan tu hashMap
        //Phuong thuc put() duoc su dung de them phan tu, dong thoi cung co the su dung de cap nhap gia tri cua phan tu
        map.put("C", "C#");
        System.out.println(map);
        //xoa phan tu hashMap
        map.remove("Py");
        System.out.println(map);
    }

}
