package com.nghianv.ioexample;

import java.io.File;
import java.nio.file.Files;

public class DeleteFolderEx {
	public static void main(String[] args) {
		File file = new File("E:\\Directory4\\filedelete.txt");
		deleteDir(file);
	}

	public static void deleteDir(File file) {
		if (file == null) {
			return;
		}
		// neu file la thu muc thi xoa het thu muc con va file cua no
		if (file.isDirectory()) {
			//liet ke tat ca thu muc va file
			String[] files = file.list();
			for (String child : files) {
				File childDir = new File(file, child);
				if (childDir.isDirectory()) {
					// neu childDir la thu muc thi goi lai phuong thuc delereDir()
					deleteDir(childDir);
				} else {
					// neu childDir la file thi xoa
					childDir.delete();
					System.out.println("file da bi xoa- " + childDir.getAbsolutePath());
				}
			}
			//check lai va xoa thu muc cha
			if (files.length == 0) {
				file.delete();
				System.out.println("file da bi xoa-- " + file.getAbsolutePath());
			}
		} else {
			// neu la file thi xoa
			file.delete();
			System.out.println("file da bi xoa " + file.getAbsolutePath());
		}
	}
}
