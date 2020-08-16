package com.nghianv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStrEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream("E:\\testout2.txt");
			int i = 0;
			while ((i = fileIn.read()) != -1) {
				System.out.print((char) i);
			}
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fileIn.close();
		}
	}
}
