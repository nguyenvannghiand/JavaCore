package com.nghianv;

import java.io.Console;
import java.util.Scanner;

public class ConsoleEx2 {
	public static void main(String[] args) {
		String userName, password;
		char[] chars;
		Scanner scanner = null;
		Console console = System.console();
		if (console == null) {
			scanner = new Scanner(System.in);
			System.out.println("Enter your's name");
			userName = scanner.next();
			System.out.println("Enter your's password");
			password = scanner.next();
			System.out.println("Hello: " + userName);
			System.out.println("Password is: " + password);
		} else {
			System.out.println("Enter your's name");
			userName = console.readLine();
			System.out.println("Enter your's password");
			chars = console.readPassword();
			//convert chars array to string
			String pass = String.valueOf(chars);
			System.out.println("Hello: " + userName);
			System.out.println("Password is: " + pass);
		}

	}
}
