package com.nghianv.deamon;

public class DeamonTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("==> Main theard running...\n");
		//Create thread
		Thread deamonThread = new DeamonThread();
		//set deamon thread
		deamonThread.setDaemon(true);
		deamonThread.start();

		//Create one thread other
		Thread noneDeamonThread = new NonDeamonThread();
		//set none deamon thread
		noneDeamonThread.setDaemon(false);
		noneDeamonThread.start();

		//sleep 5000 milliseconds
		Thread.sleep(5000);
		// Ghi ra luong main nay ket thuc
		System.out.println("\\n==> Main Thread ending\\n");

	}
}
