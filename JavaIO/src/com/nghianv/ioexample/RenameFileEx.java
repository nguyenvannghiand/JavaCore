package com.nghianv.ioexample;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFileEx {
	public static void main(String[] args) {
		String dir = "E:\\file.txt";
		String newName = "newnamefile.txt";
		File oldFile = new File(dir);
		Path source = Paths.get(dir);
		try {
			if (!oldFile.exists()) {
				System.out.println("Directory does not exits : " + oldFile);
			}
			Files.move(source, source.resolveSibling(newName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
