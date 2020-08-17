package com.nghianv.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("E:\\fileout.txt"));
			//read student
			Student student = (Student) ois.readObject();
			//show student
			System.out.println(student.toString());
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
