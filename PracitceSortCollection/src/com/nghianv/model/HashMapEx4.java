package com.nghianv.model;

import java.util.*;

public class HashMapEx4 {
    /*
    Lop HashMap trong java la mot lop ke thua lop AbstractMap va trien khai cua Map interface trong Collections Framwork
    nen no se co mot vai dac diem va phuong thuc tuong dong voi Map.Hash Map duoc su dung de luu tru phan tu duoi dang
    key/value.key va value la kieu du lieu bat ky, va ban co the truy cap cac gia tri cua hashMap bang 1 key cu the
    HashMap la 1 trong nhung cau truc du lieu hay duoc su dung nhat trong java,nhuwng ban than map thi lai khong phai
    duoc coi la 1 collection boi vi no khong duoc implement Collection Interface. Nhung di nhien, 1 collection view co the
    dai dien cho map thong qua method entrySet(), hoac de lay duoc collection view cua cac khoa, java ho tro method keySet()

     */
    public static void main(String[] args) {
        Map<LangKey, String> langMap = new HashMap<>();
        langMap.put(new LangKey(1, "EN"), "English");
        langMap.put(new LangKey(2, "VI"), "Vietnamese");
        langMap.put(new LangKey(3, "ES"), "Spainish");
        langMap.put(new LangKey(4, "JP"), "Japanese");
        System.out.println("Size cua langMap la: " + langMap.size());
        System.out.println("Cac phan tu cua langMap:");
        Iterator<LangKey> iterator = langMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(langMap.get(iterator.next()));
        }
        Set<LangKey> keySet = langMap.keySet();
        for (LangKey key : keySet) {
            System.out.println(key.index + "-"+ langMap.get(key));
        }
    }
}
class LangKey{
    int index;
    String name;

    public LangKey(int index, String name) {
        this.index = index;
        this.name = name;
    }
    /*
    Ghi de phuong thuc hashcode()

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LangKey langKey = (LangKey) o;
        return index == langKey.index &&
                Objects.equals(name, langKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name);
    }
}
