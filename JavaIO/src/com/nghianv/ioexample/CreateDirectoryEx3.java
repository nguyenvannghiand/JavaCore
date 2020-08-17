package com.nghianv.ioexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryEx3 {
	/*
	Voi jDK 7 tro len ta co the su dung phuong thuc createDirectories()
	 */
	public static void main(String[] args) {
		Path path3 = Paths.get("E:\\Directory3");
		Path path4 = Paths.get("E:\\Directory4\\Sub4\\Sub-Sub4");
		//tao duong dan thu muc duy nhat
		if (!Files.exists(path3)) {
			try {
				Files.createDirectories(path3);
				System.out.println("Create paths = " + path3 + " successfully!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Path = " + path3 + " is existed");
		}

		// tao duong dan voi cac thu muc con
		if (!Files.exists(path4)) {
			try {
				Files.createDirectories(path4);
				System.out.println("Create paths =" + path4+ " successfully!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Path = " + path4 + " is existed!");
		}
	}
}
