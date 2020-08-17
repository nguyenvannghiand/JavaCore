package com.nghianv;

import java.io.FileWriter;
import java.io.IOException;

public class FilewriteEx {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("E:\\fileout.txt");
			fileWriter.write("Hi, wellcome to java");
			fileWriter.close();
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fileWriter.close();
		}

	}
}
