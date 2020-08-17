package com.nghianv.ioexample;

import java.io.*;

public class CopyFileBuffer2 {
	/*
	Buffered Stream duoc sinh ra de tang toc do hoat dong IO, tiet kiem tai nguyen va thoi gian
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			Reader reader = new FileReader("E:\\filein.txt");
			Writer writer = new FileWriter("E:output2.txt");

			bufferedReader = new BufferedReader(reader);
			bufferedWriter = new BufferedWriter(writer);

			int c;
			while ((c = reader.read()) != -1) {
				bufferedWriter.write(c);
			}
			System.out.println("Success...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}

	}
}
