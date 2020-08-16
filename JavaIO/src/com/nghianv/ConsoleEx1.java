package com.nghianv;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleEx1 {
	public static void main(String[] args) {
		System.out.print("Enter Username: ");
		try {
			InputStreamReader streamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(streamReader);
			String username = bufferedReader.readLine();
			System.out.println("Wellcome: " + username);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
