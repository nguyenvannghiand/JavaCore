package com.nghianv.yield;

import java.util.Date;

public class YieldThreadExample {
	private static Date importantEndTime;
	private static Date unImportantEndTime;

	public static void main(String[] args) {
		importantEndTime = new Date();
		unImportantEndTime = new Date();

		System.out.println("Create thread 1");

		Thread importantThread = new ImportantThread();

		// set do uu tien cao nhat cho thread nay.
		importantThread.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Create thread 2");

		Thread unImportantThread = new UnImportantThread();

		// Set do uu tien thap nhat cho thread nay.
		unImportantThread.setPriority(Thread.MIN_PRIORITY);

		// Start threads.
		unImportantThread.start();
		importantThread.start();

	}

	// Mot nhiem vu quan trong, yeu cau do uu tien cao.
	static class ImportantThread extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 100000; i++) {
				System.out.println("\n Important work " + i);

				// Thong bao voi he dieu hanh, thread nay nhuong quyen uu tien cho luong khac
				Thread.yield();
			}

			// Thoi diem ket thuc cua luong nay.
			importantEndTime = new Date();
			printTime();
		}

	}

	static class UnImportantThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100000; i++) {
				System.out.println("\n  -- UnImportant work " + i);
			}
			// Thoi diem ket thuc cua thread nay.
			unImportantEndTime = new Date();
			printTime();
		}
	}

	private static void printTime() {
		// Khoang thoi gian (miliseconds).
		long interval = unImportantEndTime.getTime() - importantEndTime.getTime();

		System.out.println("UnImportant Thread - Important Thread = " //
				+ interval + " milliseconds");
	}
}
