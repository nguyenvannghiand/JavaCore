package com.nghianv.exception;

import java.util.Random;

public class ThreadExceptionDemo {
	public static class RunnableTest implements Runnable{

		@Override
		public void run() {
			System.out.println("Thread running");
			while (true) {
				Random r = new Random();
				int i = r.nextInt(100);
				System.out.println("Next value " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i > 70) {
					//Mo phong 1 ngoai le da khong duoc su ly trong luong
					throw new RuntimeException("Have a problem");
				}


			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread running...");
		Thread thread = new Thread(new RunnableTest());
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("#thread "+ t);
				System.out.println("#thread exception message "+ e.getMessage());
			}
		});
		thread.start();
		System.out.println("==> Main thread end");

	}
}
