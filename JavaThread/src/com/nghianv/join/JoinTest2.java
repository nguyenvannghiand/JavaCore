package com.nghianv.join;

public class JoinTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("==> Main thread starting...");
		Thread joinThreadA = new JoinThread("A", 5);
		joinThreadA.start();
		// luong cha(main) phai cho 5000 miliseconds moi duoc tiep tuc chay(khong nhat thiet phai A ket thuc)
		joinThreadA.join(5000);
		System.out.println("Main thread after 5000 milli second");
		System.out.println("Hello from main thread...");

		System.out.println("Thread A isLive? " + joinThreadA.isAlive());

		System.out.println("==> Main Thread end!");

	}
}
