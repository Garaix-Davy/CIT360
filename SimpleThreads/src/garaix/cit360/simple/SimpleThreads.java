package garaix.cit360.simple;

import static garaix.cit360.simple.ThreadColor.*;

public class SimpleThreads {

	public static void main(String[] args) {
		System.out.println(ANSI_CYAN + "Hello from the main thread.");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		anotherThread.start();
		
		// anonymous class
		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
			}
			
		}.start();
		
		Thread myRunnableThread = new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println(ANSI_YELLOW + "Hello from the anonymous class's implementation of run()");
				try {
					anotherThread.join(2000);
					System.out.println(ANSI_YELLOW + "AnotherThread terminated, or timed out, so I'm running again");
				} catch(InterruptedException e) {
					System.out.println(ANSI_YELLOW + "I couldn't wait afterall. I was interrupted");
				}
			}
		});
		
		myRunnableThread.start();
		
		
		System.out.println(ANSI_CYAN + "Hello again from the main thread.");
		

	}

}
