package com.nghianv.ioexample;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class MyFiles {
	public static void main(String[] args) {
		File fileOrDir = new File("E\\Myfile");
		new MyFiles().traverseDepthFiles(fileOrDir);

	}

	public void traverseDepthFiles(File fileOrDir) {
		//check xem fileOrDir la file hay folder
		if (fileOrDir.isDirectory()) {
			// in ten folder ra man hinh
			System.out.println(fileOrDir.getAbsolutePath());
			final File[] children = fileOrDir.listFiles();
			if (children == null) {
				return;
			}
			//sap xep file theo thu tu tang dan
			Arrays.sort(children, new Comparator<File>() {
				@Override
				public int compare(File o1, File o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			for (final File file : children) {
				// goi lai ham traverseDepthFiles()
				traverseDepthFiles(file);
			}

		} else {
			// in ten file ra man hinh
			System.out.println(fileOrDir.getAbsolutePath());
		}
	}
}
