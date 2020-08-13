package com.nghianv.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx2 {
	public static void main(String[] args) {
		//creat list students
		List<Student> list = new ArrayList<>();
		list.add(new Student("An", 22, "Ha Noi"));
		list.add(new Student("Hanh", 23, "Ha Nam"));
		list.add(new Student("Name", 24, "Nam Dinh"));
		list.add(new Student("Ninh", 21, "Ha Noi"));
		//sort list student
		Collections.sort(list);
		//show list student
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
