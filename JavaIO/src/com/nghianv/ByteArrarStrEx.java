package com.nghianv;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrarStrEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout1 = null;
		FileOutputStream fout2 = null;
		ByteArrayOutputStream byteOut = null;

		try {
			fout1 = new FileOutputStream("E:\\f1.txt");
			fout2 = new FileOutputStream("E:\\f2.txt");
			byteOut = new ByteArrayOutputStream();
			String data = "Hello";
			byteOut.write(data.getBytes());
			byteOut.writeTo(fout1);
			byteOut.writeTo(fout2);
			byteOut.flush();
			fout1.close();
			fout2.close();
			System.out.println("Success....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			byteOut.flush();
			fout1.close();
			fout2.close();
		}

	}
}
