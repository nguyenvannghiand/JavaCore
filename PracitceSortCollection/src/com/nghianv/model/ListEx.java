package com.nghianv.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListEx {
    /*
    List la 1 interface trong java. No chua cac phuong thuc de chen va xoa cac phan tu dua tren chi so index
    */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        System.out.println("Phan tu co index = 1 la: " + list.get(1));
        //show list through for-each
        for (String s: list) {
            System.out.println(s);
        }
        //creat new Array
        String[] array = {"Java", "C++", "PHP"};
        //convert array to List
        List<String> arraytoList = Arrays.asList(array);
        //show list
        for (String s: arraytoList) {
            System.out.println(s);
        }
        // List Interator trong java la mot interface duoc su dung de duyet cac phan tu cua list  trong java
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Duyet cac phan tu tu dau den cuoi");
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
        System.out.println("Duyet cac phan tu tu cuoi ve dau");
        while (iterator.hasPrevious()) {
            System.out.println("\t" + iterator.previous());
        }
    }
}
