package com.nghianv.model;

import java.util.HashSet;

public class HashSetEx {
    /*
    Lop HashSet trong java la mot lop ke thua lop AbstractSet va trien khai cua Set Interface trong Collections Framwork
    nen no se co mot vai dac diem va phuong thuc tuong dong voi set. HashSet duoc su dung de tao mot bo suu tap bang bam
    de luu tru. No ke thua lop AbstractSet va trien khai Set Interface
    Mot hash table luu tru thong tin boi su dung 1 ky thuat duoc goi la hashting(bam). trong hasting noi dung mang tinh
    thong tin cua 1 key duoc su dung de quyet dinh mot value duy nhat, duoc goi la hashcode cua no
    Hashcode sau do duoc su dung nu la index, tai do du lieu ma lien ket voi key duoc luu tru. Phep bien doi cua key
    vao trong hashcode cua no duoc thuc hien tu dong
    Cac dac diem quan trong cua HashSet trong java
    1.HashSet chi chua cac phan tu duy nhat
    2. HashSet luu tru cac phan tu bang cach su dung 1 co che goi la bam(hashtable)
    Set la 1 interface ke thua Collection interface trong java. set trong java la 1 collection khong the chua cac phan tu trung lap
    !Cau truc du lieu ben trong HashSet
    HashSet su dung HashMap noi bo de luu tru cac phan tu. Bat cu khi nao tao mot doi tuong HashSet, 1 doi tuong HashMap lien ket voi no
    cung duoc tap ra. Doi tuong HashMap nay duoc su dung de luu tru cac phan tu them vao HashSet.Cac phan tu them vao HashSet
    duoc luu tru nhu cac khoa(key) cua doi tuong HashMap nay. Gia tri value ket hop voi cac khoa key do se la mot hang so
    Moi ham tao doi tuong ben trong lop HashSet tao ra mto doi duong HashMap.
    ! Cach Hashset hoat dong trong Java
    Bat cu khi nao them 1phan tu vao HashSet bang cach su dung phuong thuc add(), no thuc su tao ra 1 doi tuong Entry ben trong
    doi tuong HashMap, voi phan tu da chi dinh lam khoa va gia tri khong doi goi la PRESENT. Gia tri PRESENT duoc dinh nghia ben trong
    lop HashSet
     */
    public static void main(String[] args) {
        // tao mot doi tuong Hashset
        HashSet<String> set = new HashSet<>();
        //adding element to HashSet
        set.add("RED");
        set.add("GREEN");
        set.add("BLUE");
        set.add("PINK");

    }
}

