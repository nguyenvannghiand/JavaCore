package com.nghianv.ioexample;

import java.io.File;
import java.net.URL;

public class GetCurrentDirEx2 {
	public static void main(String[] args) {
		URL location = GetCurrentDirEx2.class.getProtectionDomain().getCodeSource().getLocation();
		File file = new File(location.getFile());
		System.out.println("current dir : " + file.getParent());

	}
}
