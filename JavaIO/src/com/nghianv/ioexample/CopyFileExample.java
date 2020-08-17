package com.nghianv.ioexample;

import java.awt.desktop.OpenURIEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileExample {
	/*
	Java khong ho tro san phuong thuc nao de coppy.Tuy nhien ta co the tao ra chuc nang nay. De copy file trong java,
	ta phai chuyen doi file thanh dang bytestream voi FileInputStream va ghi cac byte do vao 1 file khac voi FileOutputStream
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("E:\\filein.txt");
			outputStream = new FileOutputStream("E:\\fileoutputstr.txt");
			int length;
			byte[] buffer = new byte[1024];
			//copy the file content in bytes
			while ((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer,0,length);
			}
			System.out.println("File is copy successful..");

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
