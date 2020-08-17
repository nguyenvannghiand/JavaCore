package com.nghianv.ioexample;

import java.io.File;

public class CreateDirectorEx1 {
	public static void main(String[] args) {
		File file = new File("E:\\Directory1");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory");
			}
		}

	}
}
