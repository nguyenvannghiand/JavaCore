package com.nghianv.ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesExample1 {
	private static final String FILE_CONFIG = "\\config.properties";

	public static void main(String[] args) throws IOException {
		InputStream inputStream = null;
		Properties properties = new Properties();
		String currentDir = System.getProperty("user.dir");
		try {
			inputStream = new FileInputStream(currentDir + FILE_CONFIG);
			// load properties from file
			properties.load(inputStream);
			//get properties by name
			System.out.println(properties.getProperty("username"));
			System.out.println(properties.getProperty("password"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			//close object
			try {
				if (inputStream != null) {
					inputStream.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
