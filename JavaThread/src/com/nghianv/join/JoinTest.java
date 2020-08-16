package com.nghianv.join;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("==> Main thread starting...");
		Thread joinThreadA = new JoinThread("A*", 2);
		Thread joinThreadB = new JoinThread("B*", 3);

		//thread thong thuong se khong su dung join()
		Thread noJoinThreadC = new JoinThread("C", 5);

		joinThreadA.start();
		joinThreadB.start();
		noJoinThreadC.start();
		//su dung join()
		joinThreadA.join();
		joinThreadB.join();

		// Doan code duoi day se phai cho cho toi khi 2 joinThreadA,B hoan thanh, moi duoc chay tiep
		System.out.println("Hello from Main thread");
		System.out.println("Thread A isLive? " + joinThreadA.isAlive());
		System.out.println("Thread B isLive? " + joinThreadB.isAlive());
		System.out.println("Thread C isLive? " + noJoinThreadC.isAlive());

		System.out.println("==> Main Thread end!");
	}
}
