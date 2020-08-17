package com.nghianv.ioexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("E:\\filein.txt");
			java.io.BufferedReader br = new java.io.BufferedReader(file);
			int i;
			while ((i = br.read()) != -1) {
				System.out.print((char) i);
			}
			br.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
