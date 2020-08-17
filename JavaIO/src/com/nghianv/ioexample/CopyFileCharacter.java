package com.nghianv.ioexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacter {
	/*
	Byte Stream trong Java duoc su dung de thuc hien input va output cac byte(8bit).Trong khi do Character Stream
	trong Java duoc su dung de thuc hien input va output cho Unicode (16bit). Tat ca cac class Character co nguon goc
	tu Reader va Writer
	 */
	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("E:\\filein.txt");
			out = new FileWriter("E:\\output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Success..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
