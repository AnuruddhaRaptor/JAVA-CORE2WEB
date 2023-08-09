

// Creating child thread using Runnable Interface

class MyThread implements Runnable {

	public void run() {
	
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo {

	public static void main(String [] args) {
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}

/* Most Preffered way of creating new Thread due to support of multiple
 * inheritance becauses of interface.
 *
 * Feature 
 * 
 * jr parent child relation asel aani child mdhe thread create karaicha
 * asel tr aaplyala Runnable interface use karayala pahije , because aapn 
 * javha konta pn interface implements krto tevha aapn multiple classes 
 * extends kru shkto , so aaplyala new features bhetu shktat tya classes
 * che je ki normal Thread class extends kela ki nhi midat.*/
