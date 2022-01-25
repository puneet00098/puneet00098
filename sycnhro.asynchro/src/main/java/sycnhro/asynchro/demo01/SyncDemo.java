package sycnhro.asynchro.demo01;

/**
 * Java program to demonstrate synchronous callback
 * Synchronous Callback
 *The code execution will block or wait for the event before continuing. Until your event returns a response,
 *your program will not execute any further.
 *So Basically, the callback performs all its work before returning to the call statement.
 *The problem with synchronous callbacks are that they appear to lag.
 * @author puneet
 *
 */

public class SyncDemo {

	private DemoEventListener demoListener;//listener field

	//setting the listener
	public void registerDemoListener(DemoEventListener demoListener) {
		this.demoListener = demoListener;
	}

	//my synchronous task
	public void doSyncStuff() {

		//perform any operation
		System.out.println("Performing callback before synchronous task");

		//check if listener is registered
		if(this.demoListener != null) {
			//invoke the callback method for SyncDemo
			demoListener.onDemoEvent();
		}

	}

	//driver function
	public static void main(String[] args) {
		SyncDemo obj = new SyncDemo();
		DemoEventListener demoListener = new DemoListenerImpl();
		obj.registerDemoListener(demoListener);
		obj.doSyncStuff();
	}

}
