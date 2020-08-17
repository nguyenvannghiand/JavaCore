package com.nghianv.ioexample;

import java.io.*;

public class AppendToFile {
	private static final String FILENAME = "E:\\filein.txt";
	public static void main(String[] args) {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		try {
			String data = "This is new content";
			//khai bao file
			File file = new File(FILENAME);
			if (!file.exists()) {
				file.createNewFile();
			}
			//true = append to file
			fileWriter = new FileWriter(file.getAbsoluteFile(), true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (fileWriter != null) {
					fileWriter.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}
}
