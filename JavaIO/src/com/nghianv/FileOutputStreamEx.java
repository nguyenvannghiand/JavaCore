package com.nghianv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOut = null;
			try {
				fileOut = new FileOutputStream("E:\\testout.txt");
				fileOut.write(65);
				fileOut.close();
				System.out.println("Success...");
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				//close file output stream
				fileOut.close();
			}
	}
}
