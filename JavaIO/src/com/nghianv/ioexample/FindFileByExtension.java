package com.nghianv.ioexample;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileByExtension {
	private static final String FILE_DIR = "E:\\";
	private static final String FILE_TEXT_TXT = ".txt";

	public static void main(String[] args) {
		new FindFileByExtension().listFile(FILE_DIR, FILE_TEXT_TXT);
	}

	public void listFile(String folder, String ext) {
		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File(FILE_DIR);
		if (!dir.isDirectory()) {
			System.out.println("Directory does not exists : " + FILE_DIR);
			return;
		}
		//list out all the file and filter by the extension
		String[] list = dir.list(filter);
		if (list.length == 0) {
			System.out.println("no file end with: " + ext);
			return;
		}
		for (String file : list) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
			System.out.println(file + ": " + temp);
		}


	}

	//inner class, generic extension filter
	public class GenericExtFilter implements FilenameFilter {
		private String ext;

		public GenericExtFilter(String ext) {
			this.ext = ext;
		}

		@Override
		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}
}
