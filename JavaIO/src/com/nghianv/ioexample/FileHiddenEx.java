package com.nghianv.ioexample;

import java.io.File;

public class FileHiddenEx {
	public static void main(String[] args) {
		File file = new File("E:\\filein.txt");
		boolean hidden = file.isHidden();
		String str = hidden ? "This file is hidden" : "This file not hidden";
		System.out.println(str);

	}
}
