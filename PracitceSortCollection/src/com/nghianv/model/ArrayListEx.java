package com.nghianv.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
    /*
    Lop Arraylist trong java la mot lop ke thua lop AbstractList va trien khai cua List Interface trong Collections Framwork
    nen no se cos mot vai dac diem va phuong thuc tuong dong voi List. ArrayList duoc su dung nhu mot mang dong de luu tru cac phan tu
    Nhung dac diem can ghi nho
    1.Lop ArrayList trong java co the chua cac phan tu trung lap
    2. Lop ArrayList duy tri thu tu cac phan tu duoc them vao
    3. Lop ArrayList la khong dong bo
    4. Lop ArrayList cho phep truy cap ngau nhien vi no luu tru du lieu theo chi muc
    5. Lop ArrayList trong Java, thao tac cham vi can nhieu su dich chuyen neu bat ky phan tu nao bi xoa khoi dich sach
    !Contructor
    ArrayList(): no duoc su dung de khoi tao mang trong
    ArrayList(Collection c) : no duoc su dung de xay dung mot danh sach mang duoc khoi tao voi cac phan tu cua collection c
    ArrayList(int capacity): no duoc su dung de xay dung mot danh sach mang ma co dung luong ban dau duoc chi dinh
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
       //su dung phuong thuc toArray() chuyen list thanh mang
        //ket qua cua phuong thuc nay se tra ve mang arr
        Object[] arr = list.toArray();
        //hien thi cac phan tu co trong mang arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu tai vi tri " + i + " trong array la " + arr[i]);
        }
    }

    public static void showList(ArrayList<String> list) {
        //show list through for-each
        for (String s : list) {
            System.out.println("\t" + s);
        }
        System.out.println();
    }

}
