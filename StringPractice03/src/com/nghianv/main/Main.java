package com.nghianv.main;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static final String KEY_IGNORE = "[<>?,()]";

	public static void main(String[] args) {
		String s = "(K key, Function<? super K,? extends V> mappingFunction)";
		System.out.println("1.xoa cac ky tu");
		s = removeSpecialString(s);
		System.out.println(s);
		System.out.println("2.Chuyen in hoa thanh in thuong");
		s = s.toLowerCase();
		System.out.println(s);
		System.out.println("3.Replace k >> key");
		s = s.replaceAll("k", "key");
		String s2 = s;
		System.out.println(s);
		System.out.println("4.xoa cac ky tu khoang trang trong chuoi");
		s = s.replaceAll("\\s+", "");
		System.out.println(s);
		System.out.println("5.In ra ky tu xuat hien nhieu nhat");
		countOfOccurrences(s);
	}

	public static String removeSpecialString(String s) {
		if ((s == null)) {
			return s;
		}
		return s.replaceAll(KEY_IGNORE, "");
	}

	public static void countOfOccurrences(String str) {
		int[] counter = new int[256];
		int max = 0;
		int index = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			counter[str.charAt(i)]++;
		}
		char[] array = new char[str.length()];
		for (int i = 0; i < len; i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == array[j])
					flag++;
			}
			if (flag == 1) {
				System.out.println("\t" + "So lan xuat hien cua " + str.charAt(i) + " trong chuoi:" + counter[str.charAt(i)]);
			}
			if (max < counter[str.charAt(i)]) {
				max = counter[str.charAt(i)];
				index = i;
			}
		}
		System.out.println("Ky tu xuat hien nhieu nhat la : " + str.charAt(index) + " - " + max + " lan");
	}

}
