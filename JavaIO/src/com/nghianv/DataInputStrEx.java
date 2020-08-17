package com.nghianv;

import java.io.*;

public class DataInputStrEx {
	public static void main(String[] args) throws IOException {
		InputStream input = null;
		DataInputStream dis = null;

		try {
			input = new FileInputStream("E:\\testout2.txt");
			dis = new DataInputStream(input);
			int count = input.available();
			byte[] arr = new byte[count];
			dis.read(arr);
			for (byte b : arr) {
				char k = (char) b;
				System.out.print(k + "-");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			dis.close();
		}

	}
}
