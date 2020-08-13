package com.nghianv.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsEx4 {
	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		// add students to list
		listStudents.add(new Student("Vinh", 19, "Hanoi"));
		listStudents.add(new Student("Hoa", 19, "Hanoi"));
		listStudents.add(new Student("Phu", 20, "Hanoi"));
		listStudents.add(new Student("Quy", 22, "Hanoi"));
		// sort list student
		Collections.sort(listStudents, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		// show list student
		for (Student student : listStudents) {
			System.out.println(student);
		}
	}
}
