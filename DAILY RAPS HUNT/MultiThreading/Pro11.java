

class MyThread extends Thread {

	MyThread(ThreadGroup tg, String str) {
	
		super(tg, str);
	}

	public void run() {
	
		System.out.println(Thread.currentThread());
	}
} 

class ThreadGroupDemo {
	
	public static void main(String [] args) {
	
		ThreadGroup pthreadGP = new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(pthreadGP, "C");
		MyThread obj2 = new MyThread(pthreadGP, "JAVA");
		MyThread obj3 = new MyThread(pthreadGP, "PYTHON");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		ThreadGroup cthreadGP = new ThreadGroup(pthreadGP, "Incubator");

		MyThread obj4 = new MyThread(cthreadGP, "FLUTTER");
		MyThread obj5 = new MyThread(cthreadGP, "SPRINGBOOT");
		MyThread obj6 = new MyThread(cthreadGP, "REACT-JS");
		
		obj4.start();
		obj5.start();
		obj6.start();
	}
}
