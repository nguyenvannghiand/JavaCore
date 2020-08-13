package com.nghianv.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollections {
	/*
	public void sort(List list) duoc su dung de sap xep cac phan tu cua list. Voi dieu kien cac phan tu cua list
	phai la kieu Comparable. Nghia la lop cac phan tu phai duoc implement giao dien Comparable
	! Lop string va cac lop wrapper duoc implements giao dien Comparable.Vi vay neu luwu tru du lieu duoi dang String
	hoac cac lop wrapper thi chung da la kieu Comparable. khi do co the ap dung sort(list) ma khong can cai dat them
	 */
	public static void main(String[] args) {
		//Creat list
		List<String> list = new ArrayList<>();
		// add elements to list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("C#");
		list.add("Python");
		//sort list
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
