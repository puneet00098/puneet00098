package sycnhro.asynchro.demo01;

public class DemoListenerImpl implements DemoEventListener {

	public void onDemoEvent() {
		
		System.out.println("Performing callback after Demo task");
	}

	//some SyncDemoA methods
}
