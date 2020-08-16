package com.nghianv;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStrEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream("E:\\testout2.txt");
			bin = new BufferedInputStream(fin);
			int i = 0;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			bin.close();
			fin.close();
		}
	}
}
