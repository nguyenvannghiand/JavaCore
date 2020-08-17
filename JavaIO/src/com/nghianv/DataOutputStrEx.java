package com.nghianv;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStrEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = null;
		DataOutputStream data = null;

		try {
			file = new FileOutputStream("E:\\testout3.txt");
			data = new DataOutputStream(file);
			data.writeInt(65);
			data.flush();
			System.out.println("Success....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			data.close();
		}
	}
}
