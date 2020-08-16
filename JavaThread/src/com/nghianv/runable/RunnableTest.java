package com.nghianv.runable;

public class RunnableTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread running...");
		// Creat thread by Runnable
		Thread thread = new Thread(new RunnableDemo());
		thread.start();
		// sleep 5000 miliseconds
		Thread.sleep(5000);
		System.out.println("Main thread stopped");
	}
}
