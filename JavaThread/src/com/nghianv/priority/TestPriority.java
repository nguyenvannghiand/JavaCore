package com.nghianv.priority;

public class TestPriority extends Thread {
	@Override
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		TestPriority thread1 = new TestPriority();
		TestPriority thread2 = new TestPriority();
		thread1.setPriority(MIN_PRIORITY);
		thread2.setPriority(MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}

}
