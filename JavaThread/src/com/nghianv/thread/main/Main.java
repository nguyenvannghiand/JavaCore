package com.nghianv.thread.main;

import com.nghianv.thread.model.HelloThread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		int idx = 1;
		for (int i = 0; i < 2; i++) {
			System.out.println("Main theard running  " + idx++ );
			//sleep 2101 milisecond
			Thread.sleep(2101);
		}
		HelloThread helloThread = new HelloThread();
		// run helloThread
		helloThread.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread running " + idx++);
			// slepp 2101 miliseconds
			Thread.sleep(2101);
		}
		System.out.println("==> Main Thread stopped");
	}
}
