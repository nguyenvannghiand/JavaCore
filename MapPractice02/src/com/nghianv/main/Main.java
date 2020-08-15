package com.nghianv.main;

import com.nghianv.model.Bike;

import java.util.*;

public class Main {
	private static String storeA = "BikeStoreA";
	private static String storeB = "BikeStoreB";
	private static String storeC = "BikeStoreC";
	public static void main(String[] args) {
		List<Bike> bikeListStoreA = new ArrayList<>();
		bikeListStoreA.add(new Bike("Xanh", 10));
		bikeListStoreA.add(new Bike("Do", 7));
		bikeListStoreA.add(new Bike("Tim", 15));
		bikeListStoreA.add(new Bike("Vang", 35));
		//
		List<Bike> bikeListStoreB = new ArrayList<>();
		bikeListStoreB.add(new Bike("Xanh", 6));
		bikeListStoreB.add(new Bike("Do", 17));
		bikeListStoreB.add(new Bike("Tim", 30));
		//
		List<Bike> bikeListStoreC= new ArrayList<>();
		bikeListStoreC.add(new Bike("Xanh", 16));
		bikeListStoreC.add(new Bike("Do", 56));
		bikeListStoreC.add(new Bike("Tim", 12));
		bikeListStoreC.add(new Bike("Vang", 17));
		Map<String, List<Bike>> map = new HashMap<>();
		map.put(storeA, bikeListStoreA);
		map.put(storeB, bikeListStoreB);
		map.put(storeC, bikeListStoreC);
		Set<String> ketSet = map.keySet();
		for (String key : ketSet) {
			List<Bike> bikeList = map.get(key);
			for (int i = 0; i < bikeList.size(); i++) {
				if (15 < bikeList.get(i).getPrice() && bikeList.get(i).getPrice() < 35) {
					System.out.println(key + ":" + bikeList.get(i));
				}
			}
		}
	}
}
