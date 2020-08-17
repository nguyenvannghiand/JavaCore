package com.nghianv.ioexample;

import java.io.File;
import java.io.FilenameFilter;

public class DeleteFilesExample {
	private static final String FILE_DIR = "E:\\";
	private static final String FILE_TEXT_EXT = ".dat";

	public static void main(String[] args) {
		new DeleteFilesExample().deleteFiles(FILE_DIR,FILE_TEXT_EXT);
	}

	public void deleteFiles(String folder, String ext) {
		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File(folder);
		//list out all the file name with .data extension
		String[] list = dir.list(filter);
		//delete files
		if (list.length == 0) {
			System.out.println("no file end with: " + ext);
			return;
		}
		File fileDelete;
		for (String file : list) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
			System.out.println("file : " +temp);
			fileDelete = new File(temp);
			boolean isDeleted = fileDelete.delete();
			System.out.println("file: " +temp + " isDeleted : " + isDeleted);
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
