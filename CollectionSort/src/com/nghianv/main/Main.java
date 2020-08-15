package com.nghianv.main;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a-HaNoi01");
		list1.add("b-NamDinh01");
		list1.add("c-HaNoi06");
		list1.add("d-NamDinh03");
		list1.add("e-NamDinh08");
		list1.add("f-HaNoi05");
		list1.add("g-HaNoi02");
		//
		List<String> list2 = new ArrayList<>();
		list2.add("HaNoi03-a");
		list2.add("NamDinh01-b");
		list2.add("c-HaNoi06");
		list2.add("NamDinh07-c");
		list2.add("e-NamDinh06");
		list2.add("f-HaNoi05");
		list2.add("HaNoi07-g");
		System.out.println(list1);
		System.out.println(list2);
		List<String> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		//
		System.out.println("----------");
		System.out.println("1.Sap xep chuoi");
		System.out.println("Chuoi 1 sau khi format la: ");
		list3 = reverseItemList(list1);
		Collections.sort(list3);
		System.out.println(list3);

		System.out.println("Chuoi 2 sau khi format la: ");
		list4 = reverseItemList(list2);
		Collections.sort(list4);
		System.out.println(list4);
		//
		System.out.println("2.In ra tat ca cac item khong chung cua 2 mang");
		List<String> itemListPrint = new ArrayList<>(list3);
		itemListPrint.removeAll(list4);
		list4.removeAll(list3);
		itemListPrint.addAll(list4);
		System.out.println(itemListPrint);


	}

	public static List<String> reverseItemList(List<String> list) {
		String item;
		for (int i = 0; i < list.size(); i++) {
			item = list.get(i);
			if (item.indexOf("-") >= 2) {
				list.set(i, reverseString(item));
			}
		}
		return list;
	}
	public static String reverseString(String string) {
		String reverse = "";
		String[] subString = string.split("-");
		reverse = reverse.concat(subString[1]).concat("-").concat(subString[0]);
		return reverse;
	}

}
