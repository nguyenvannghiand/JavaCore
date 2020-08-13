package com.nghianv.model;

public class TestSleepEx1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		TestSleepEx1 t1 = new TestSleepEx1();
		TestSleepEx1 t2 = new TestSleepEx1();
		t1.start();
		t2.start();
	}

}
