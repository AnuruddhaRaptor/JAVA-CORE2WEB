

class MyThread extends Thread {

	public void run() {
	
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	} 

	public void start() {
	
		System.out.println("In MyThread start");
		run();
	}
} 

class ThreadDemo {

	public static void main(String [] args) {
	
		MyThread obj = new MyThread();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
} 

/*start method kdhich override nhi karaichi karan aaplya start method 
  mdhun run() la call jaat nhi, tyanchya start() method mdhun run la call gelela aahe.
 
      	Start this Thread, calling the run() method of the Runnable this Thread
      	was created with, or else the run() method of the Thread itself. This
      	is the only way to start a new thread; calling run by yourself will just
      	stay in the same thread. The virtual machine will remove the thread from
      	its thread group when the run() method completes.
    
      	@throws IllegalThreadStateException if the thread has already started
      	@see #run()
     
    	public synchronized void start()
    	{
      		if (vmThread != null || group == null)
        	throw new IllegalThreadStateException();
 
        	VMThread.create(this, stacksize);
    	}
 
    
      	Cause this Thread to stop abnormally because of the throw of a ThreadDeath
      	error. If you stop a Thread that has not yet started, it will stop
      	immediately when it is actually started.
     
      	<p>This is inherently unsafe, as it can interrupt synchronized blocks and
      	leave data in bad states.  Hence, there is a security check:
      	<code>checkAccess(this)</code>, plus another one if the current thread
      	is not this: <code>RuntimePermission("stopThread")</code>. If you must
      	catch a ThreadDeath, be sure to rethrow it after you have cleaned up.
      	ThreadDeath is the only exception which does not print a stack trace when
      	the thread dies. */

