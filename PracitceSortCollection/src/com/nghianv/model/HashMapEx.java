package com.nghianv.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    /*
    Lop HashMap trong java la mot lop ke thua lop AbstractMap va trien khai cua Map interface trong Collection Framwork
    nen no se co mot dac diem va phuog thuc tuong dong voi Map. HashMap duoc su dung de luu tru cac phan tu duoi dang
    key/value. key va value la kieu du lieu bat ky, va co the truy cap gia tri cua HashMap bang 1 key cu the
    !Nhung diem quan trog ve lop HashMap trong java
    1.HashMap luu tru du lieu duoi dang key va value
    2.No chua cac key duy nhat
    3. No co the co 1 key la null va nhieu gia tri null
    4.No duy tri cac phan tu khong theo thu tu
     */
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        //them cac phan tu vao hashMap
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "PHP");
        map.put(4, "Python");
        System.out.println(map);
        //duyet cac pohan tu cua HashMap
        /*
        vi chung ta se su dung ham ketSet() de lay ra mot duong tuong Set chua cac key cua HashMap. Sau do dung vong lap
        for de lap cac key cua doi tuong set.Su dung cac key nay de lay gia tri tuong ung duoc luu tru trong doi tuong HashMap
         */
        //hien thi HashMap
        show(map);
        //su dung Map.Entry interface- duyet cac phan tu cua HashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ "_" + entry.getValue());
        }
        // su dung Iterator- duyet cac phan tu cua HashMap
        // Co the su dung phuong thuc keySet.iterator() de duyet cac phan tu cua HashMap
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }


    }

    public static void show(HashMap<Integer, String> hashMap) {
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + "- " + hashMap.get(key));
        }
    }


}
