package com.nghianv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("E:\\file.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Hello, wellcome to Java");
		buffer.close();
		System.out.println("Success...");
	}

}
