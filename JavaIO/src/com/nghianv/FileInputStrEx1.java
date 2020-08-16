package com.nghianv;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStrEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream("E:\\testout.txt");
			int i = fileIn.read();
			System.out.println((char) i);
			fileIn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fileIn.close();
		}
	}
}
