

class MyThread extends Thread {

	MyThread(ThreadGroup tg, String str) {
	
		super(tg, str);
	}
	
	public void run() {
	
		System.out.println(Thread.currentThread());
		
		try{
			Thread.sleep(5000);
	
		} catch(InterruptedException ie) {
		
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroupDemo {

	public static void main(String [] args) throws InterruptedException {
	
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread t1 = new MyThread(pThreadGP, "Maha");
		MyThread t2 = new MyThread(pThreadGP, "Goa");

		t1.start();
		t2.start();
		
		ThreadGroup cThreadGP1 = new ThreadGroup(pThreadGP, "Pakistan");

		MyThread t3 = new MyThread(cThreadGP1, "Karachi");
		MyThread t4 = new MyThread(cThreadGP1, "Lahore");

		t3.start();
		t4.start();

		ThreadGroup cThreadGP2 = new ThreadGroup(pThreadGP, "Bangladesh");

		MyThread t5 = new MyThread(cThreadGP2, "Dhaka");
		MyThread t6 = new MyThread(cThreadGP2, "Mirpur");

		t5.start();
		t6.start();

		cThreadGP1.interrupt();

		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
	}
}
