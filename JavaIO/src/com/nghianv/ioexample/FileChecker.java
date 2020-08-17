package com.nghianv.ioexample;

import java.io.File;

public class FileChecker {
	public static void main(String[] args) {
		File file = new File("E:\\filein.txt");
		boolean exists = file.exists();
		String str = exists ? "File exited" : "File not found";
		System.out.println(str);
	}
}
