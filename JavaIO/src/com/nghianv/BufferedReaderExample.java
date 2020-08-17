package com.nghianv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		FileReader file = null;
		BufferedReader br = null;
		try {
			file = new FileReader("E:\\file.txt");
			br = new BufferedReader(file);
			int i;
			while ((i = br.read()) != -1) {
				System.out.print((char) i);
			}
			br.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			br.close();
			file.close();
		}

	}
}
