package com.nghianv.ioexample;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class FindFileByExtension2 {
	private static final String FILE_DIR = "E:\\";
	private static final String FILE_TEXT_TXT = ".txt";

	public static void main(String[] args) {
		new FindFileByExtension2().listFile(FILE_DIR, FILE_TEXT_TXT);

	}

	public void listFile(String folder, String ext) {
		File dir = new File(folder);
		if (!dir.isDirectory()) {
			System.out.println("Dirictory does not exits : " + FILE_DIR);
			return;
		}
		//list out all the file name and filter by the extension
		String[] list = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(ext);
			}
		});
		if (list.length == 0) {
			System.out.println("No file end with : " + ext);
		}
		for (String file : list) {
			String temp = FILE_DIR + File.separator + file;
			System.out.println("file : " +temp );
		}
	}
}
