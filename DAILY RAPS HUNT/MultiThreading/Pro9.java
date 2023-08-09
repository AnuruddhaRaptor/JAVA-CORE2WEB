
class MyThread extends Thread {

	MyThread(String str) {
	
		super(str);
	} 

	MyThread() {
	
		super();
	}

	public void run() {
	
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo {

	public static void main(String [] args) {
	
		MyThread obj1 = new MyThread("PQR");
		obj1.start();
		
		MyThread obj2 = new MyThread("PQR");
		obj2.start();

		MyThread obj3 = new MyThread();
		obj3.start();
		
		MyThread obj4 = new MyThread();
		obj4.start();
	}
}
