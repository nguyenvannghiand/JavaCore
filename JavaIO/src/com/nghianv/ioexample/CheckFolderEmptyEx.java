package com.nghianv.ioexample;

import java.io.File;

public class CheckFolderEmptyEx {
	public static void main(String[] args) {
		File file = new File("E:\\");
		if (file.isDirectory()) {
			try {
				//check thu muc rong bang phuong thuc file.list()
				if (file.list().length == 0) {
					System.out.println("Thu muc " + file.getAbsolutePath() + " la rong");
				} else {
					System.out.println("Thu muc " + file.getAbsolutePath() + " khong rong");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.getAbsolutePath() + " is not director");
		}

	}
}
