package com.nghianv;

import java.io.*;

public class FilterInStrEx {
	public static void main(String[] args) throws IOException {
		FileInputStream file = null;
		FilterInputStream filter = null;
		try {
			file = new FileInputStream("E:\\file.txt");
			filter = new BufferedInputStream(file);
			int k = 0;
			while ((k = filter.read()) != -1) {
				System.out.print((char) k);
			}
			file.close();
			filter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			file.close();
			filter.close();
		}

	}
}
