package com.nghianv;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("E:\\testout2.txt");
			String str = "Hello Java";
			byte[] b = str.getBytes(); // convert string into bye arr
			fout.write(b);
			fout.close();
			System.out.println("Success.........");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fout.close();
		}
	}
}
