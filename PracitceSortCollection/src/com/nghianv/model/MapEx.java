package com.nghianv.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    /*
    Trong java, map duoc su dung de luu tru va truy xuat du lieu theo cap key va value.Moi cap key va value
    duoc goi la muc nhap(entry). Map trong java chi chua cac gia tri key duy nhat. Map rat huu ich neu phai tim kiem,
    cap nhap hoac xoa cac phan tu tren dua vao cac key
    !Cac phuong thuc huu ich cua Map
    put(Obj key, Ojb value): No duoc su dung de chen 1 muc nhap trong map hien tai
    putAll(Map map): No duoc su dung de chen map chi dinh vao map hien tai
    remove(Obj key): no duoc su dung de xoa mot muc nhap cua key duoc chi dinh
    get(key)No duoc su dung de tra lai gia tri cho khoa duoc chi dinh
    boolean containsKey(key): No duoc su dung de tim kiem key duoc chi dinh tu map hien tai
    Set keySet(): No duoc su dung de tra doi tuong Set co chua tat cac cac keys

     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        //show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key+ "_" + map.get(key));
        }

    }
}
