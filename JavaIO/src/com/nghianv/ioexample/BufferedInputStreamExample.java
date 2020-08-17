package com.nghianv.ioexample;

import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\filein.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			int i = 0;
			while ((i = bis.read()) != -1) {
				System.out.print((char) i);
			}
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			bis.close();
			fis.close();
		}
	}
}
