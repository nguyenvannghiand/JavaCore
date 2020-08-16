package com.nghianv.deamon;

public class DeamonThread extends Thread{
	@Override
	public void run() {
		int count = 0;
		//vong lap vo han
		while (true) {
			System.out.println("+ Hello from Deamon Thread " + count++);
			//sleep 2000 milliseconds
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
