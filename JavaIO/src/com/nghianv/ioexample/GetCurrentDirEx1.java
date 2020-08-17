package com.nghianv.ioexample;

public class GetCurrentDirEx1 {
	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		System.out.println("current dir : " + currentDir);
	}
}
