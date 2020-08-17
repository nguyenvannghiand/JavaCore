package com.nghianv;

import java.io.*;

public class StringWriterExample {
	public static void main(String[] args) throws IOException {
		char[] arr = new char[512];
		StringWriter writer = new StringWriter();
		FileInputStream input = null;
		BufferedReader buffer = null;
		try {
			input = new FileInputStream("E:\\file.txt");
			buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));
			int x;
			while ((x = buffer.read(arr)) != -1) {
				writer.write(arr, 0, x);
			}
			System.out.println(writer.toString());
			writer.close();
			buffer.close();
			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			writer.close();
			buffer.close();
			input.close();
		}

	}
}
