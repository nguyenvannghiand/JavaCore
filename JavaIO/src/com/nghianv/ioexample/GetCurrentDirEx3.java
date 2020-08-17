package com.nghianv.ioexample;

import java.io.File;

public class GetCurrentDirEx3 {
	public static void main(String[] args) {
		File currentDirectory = new File("");
		System.out.println("current : " + currentDirectory.getAbsolutePath());

	}
}
