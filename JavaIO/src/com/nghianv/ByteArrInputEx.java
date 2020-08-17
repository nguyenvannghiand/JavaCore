package com.nghianv;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrInputEx {
	public static void main(String[] args) throws IOException {
		ByteArrayInputStream bis = null;
		try {
			byte[] buf = {35, 36, 37, 38};
			//Creat the new byte Arr inputStream
			bis = new ByteArrayInputStream(buf);
			int k = 0;
			while ((k = bis.read()) != -1) {
				//Conversion of a byte into char
				char ch = (char) k;
				System.out.println("ASCII value of Character is:" + k + "; "
						+ "Special character is: " + ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			bis.close();
		}

	}
}
