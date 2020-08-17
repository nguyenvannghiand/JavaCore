package com.nghianv.ioexample;

import java.io.File;
import java.io.IOException;

public class CreatFile {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\newfile.txt");
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
