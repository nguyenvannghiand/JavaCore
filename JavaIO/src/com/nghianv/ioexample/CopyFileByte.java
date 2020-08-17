package com.nghianv.ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByte {
	/*
	Cac chuong trinh su dung Byte Stream de doc du lieu tung byte(8 bit).Tat cac cac class Byte Stream co nguon goc
	tu InputStream va OutputStream
	!Co rat nhieu class ByteStream de hinh dung ByteStream hoat dong nhu the nao, ta se tap trung vao FileOutputStream
	va FileInputStream
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("E:\\filein.txt");
			outputStream = new FileOutputStream("E:\\outStream.txt");
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
			System.out.println("Success...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
