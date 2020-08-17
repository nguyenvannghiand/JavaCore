package com.nghianv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStrEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = null;
		FilterOutputStream filter = null;
		try {
			file = new FileOutputStream("E:\\file.txt");
			filter = new FilterOutputStream(file);
			String str = "Wellcome to Java";
			byte[] b = str.getBytes();
			filter.write(b);
			filter.flush();
			file.close();
			System.out.println("Success....");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			filter.flush();
		}

	}
}
