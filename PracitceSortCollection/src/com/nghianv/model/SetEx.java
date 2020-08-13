package com.nghianv.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    /*
    Set la mot interface ke thua Collection interface trong java. Set trong java la mot Collection khong the chua
    cac phan tu trung lap
    Set duoc trien khai boi Hashset, LinkedHashset, Treeset hoac EnumSet
    1.HashSet: luu tru cac phan tu cua no trong bang bam, la cach thuc hien toot nhat, tuy nhien no khong dam bao ve thu
    tu cac phan tu duoc chen vao
    2.TreeSet: luu tru cac phan tu cua no trong mot cay, sap xep cac phan tu cua no dua tren cac gia tri cua chung
    ve co ban la cham hon HashSet
    3.LinkedHashSet: duoc trien khai duoi dang bang bam voico cau truc du lieu danh sach lien ket, sap xep cac phan tu
    cua no dua tren thu tu cua chung duoc chen vao tap hop
    4.EnumSet: la mot cai dat chuyen biet de su dung voi cac kieu enum
     */
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("So phan tu cua setA: " + setA.size());
        System.out.println("Cac phan tu cua setA: " + setA);
        System.out.println("setA co chua Java khong? : " + setA.contains("Java"));
        System.out.println("setA co chua C++ khong? " + setA.contains("C++"));
        //them cac phan tu setA vao setB trong java
        Set<String> setB = new HashSet<>(setA);
        System.out.println("Cac phan tu cua setB: " + setB);
        // duyet cac phan tu trong set
        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //xoa phan tu khoi set
        setA.remove("Java");
        System.out.println("Cac phan tu cua setA sau khi xoa");
        for (String element : setA) {
            System.out.println("\t" + element);
        }
    }
}
