package sycnhro.asynchro.demo01;

public class AsyncDemo {
	private DemoEventListener demoListener;//listener field

	//setting the listener
	public void registerDemoListener(DemoEventListener demoListener) {
		this.demoListener = demoListener;
	}
	
	//my Asynch Task
	public void doAsyncTask() {
		
		//An Asynch task always executes in new thread.
		new Thread(new Runnable() {

			public void run() {
				System.out.println("Performing operations in Asynchronous Task.");
				
				//check if listener is registered
				if(demoListener != null) {
					//invoke the callback method on DemolistenerImpl
					demoListener.onDemoEvent();
				}
				
			}}).start();
	}

	//driver function
	public static void main(String[] args) {
		AsyncDemo aSyncDemo = new AsyncDemo();
		DemoEventListener demoListener = new DemoListenerImpl();
		aSyncDemo.registerDemoListener(demoListener);
		aSyncDemo.doAsyncTask();
	
	}

}
