package com.nghianv.thread.model;

public class HelloThread extends Thread {
	@Override
	public void run() {
		int index = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(" - HelloThread running " + index++);
			try {
				//sleep 1030 miliseconds
				Thread.sleep(1030);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("- ==> HelloThread stopped");
	}

}
