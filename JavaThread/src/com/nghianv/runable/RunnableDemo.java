package com.nghianv.runable;

public class RunnableDemo implements Runnable {
	@Override
	public void run() {
		int idx = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello from RunnableDemo " + idx++);
			//sleep 2000 miliseconds
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
