package com.nghianv.ioexample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesEx2 {
	private static final String FILE_CONFIG = "\\config.properties";

	public static void main(String[] args) {
		Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = ReadPropertiesEx2.class.getClassLoader().getResourceAsStream(FILE_CONFIG);
			//load properties from file
			properties.load(inputStream);
			// read properties by name
			System.out.println(properties.getProperty("username"));
			System.out.println(properties.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//close object
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
