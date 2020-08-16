package com.nghianv;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStrEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("E:\\bufferout.txt");
			bout = new BufferedOutputStream(fout);
			String str = "Wellcome to java.";
			byte[] b = str.getBytes(); //convert string to byte arr
			bout.write(b);
			bout.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			bout.close();
			fout.close();
		}
		System.out.println("Success....");
	}
}
