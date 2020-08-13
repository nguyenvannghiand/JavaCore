package com.nghianv.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsEx1 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(20D);
		list.add(15D);
		list.add(16.5D);
		//sort list ASC
		Collections.sort(list);
		//show list
		for (Double element : list) {
			System.out.println(element);
		}
		System.out.println("Sort list DESC");
		//sort list DESC
		Collections.sort(list, new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o1 > o2 ? -1 : 1;
			}
		});
		//show list
		for (Double element : list) {
			System.out.println(element);
		}

	}
}
