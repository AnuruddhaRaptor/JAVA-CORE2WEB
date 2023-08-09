
// Without using synchronised keyword

import java.util.*;

class MyThread {

	public void disp() {
	
		for(int i = 0; i<5; i++) {
			
			System.out.println("Current Running Thread : " + Thread.currentThread().getName());
		}
	}
}

class MyThread1 extends Thread {

	MyThread mt = null;

	MyThread1(MyThread mt) {
	
		this.mt = mt;
	}

	public void run() {
	
		mt.disp();
	}
}

class MyThread2 extends Thread {

	MyThread mt = null;

	MyThread2(MyThread mt) {
	
		this.mt = mt;
	}

	public void run() {
	
		mt.disp();
	}
}

class MyThread3 extends Thread {

	MyThread mt = null;

	MyThread3(MyThread mt) {
	
		this.mt = mt;
	}

	public void run() {
	
		mt.disp();
	}
}

class Raptor extends Thread {

	public static void main (String [] args) {
	
		MyThread mt = new MyThread();

		MyThread1 mt1 = new MyThread1(mt);
		MyThread2 mt2 = new MyThread2(mt);
		MyThread3 mt3 = new MyThread3(mt);

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
