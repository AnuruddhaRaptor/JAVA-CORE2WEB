

// Priorities Of Thread 

class MyThread extends Thread {

	public void run() {
	
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
} 

class ThreadDemo {

	public static void main(String [] args) {
	
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		MyThread obj1 = new MyThread();
		obj1.start();

		t.setPriority(7);
		// MIN Priority : 0
		// NORMAL Priority : 5
		// MAX Priority : 10
	      	// if 0 > priority > 10 
		// Then Exception occures
		// illegalArgumentException 	

		MyThread obj2 = new MyThread();
		obj2.start();		
		// jr prt obj2.start(); lihila tr 
		// Exception yete
		// java.Lang.illegalThreadStateException
	}
}
