package com.nghianv.ioexample;

import java.io.File;

public class CreateDirectoryEx2 {
	public static void main(String[] args) {
		File file = new File("E:\\Directory2\\SubDirectory\\Sub-SubDirectory");
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("Multiple directories are create");
			} else {
				System.out.println("Failed to create multiple directories");
			}
		} else {
			System.out.println("Multiple are exited!");
		}
	}
}
