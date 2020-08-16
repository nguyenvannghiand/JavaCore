package com.nghianv;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionEx {
	public static void main(String[] args) {
		//khai bao path1 la 1 file
		String path1 = "D:\\IO-Package\\java.txt";
		//khai bao path2 la thu muc cha cua path1
		String path2 = "D:\\IO-Package\\-";

		//cap quyen cho path1
		FilePermission file1 = new FilePermission(path2, "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);

		//cap quyen cho path2
		FilePermission file2 = new FilePermission(path1, "write");
		permission.add(file2);

		// kiem tra va in ra quyen cua path1
		if (permission.implies(new FilePermission(path1, "read, write"))) {
			System.out.println("Quyen Read, Write da duoc cap cho path " + path1);
		} else {
			System.out.println("Chi quyen Write duoc cap cho path " + path1);
		}

	}
}
