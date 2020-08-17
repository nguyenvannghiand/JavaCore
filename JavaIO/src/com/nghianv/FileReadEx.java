package com.nghianv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		try {
			reader = new FileReader("E:\\fileout.txt");
			int i;
			while ((i = reader.read()) != -1) {
				System.out.print((char) i);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
		}

	}
}
