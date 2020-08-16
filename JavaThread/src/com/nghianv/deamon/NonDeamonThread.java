package com.nghianv.deamon;

public class NonDeamonThread extends Thread{
	@Override
	public void run() {
		int i = 0;
		//Vong lap 10 lan, luong nay se ket thuc
		while (i < 10) {
			System.out.println(" - Hello from NonDeamon Thread " + i++);
			// sleep 1000 milliseconds
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Ghi ra thong bao luong thread nay ket thuc
		System.out.println("\n==> NoneDeamon Thread ending\n");
	}
}
