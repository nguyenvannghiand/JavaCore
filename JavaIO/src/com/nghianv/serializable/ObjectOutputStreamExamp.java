package com.nghianv.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExamp {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;

		Student student = new Student(1, "Hoang Thien Long", "Ha Noi", 20);
		try {
			oos = new ObjectOutputStream(new FileOutputStream("E:\\fileout.txt"));
			//write student
			oos.writeObject(student);
			System.out.println("Success....");
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
