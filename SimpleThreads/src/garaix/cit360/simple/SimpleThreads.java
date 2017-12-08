package garaix.cit360.simple;

import static garaix.cit360.simple.ThreadColor.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		
		// This create a thread pool with 2 threads executing tasks.
		ExecutorService threadPool = Executors.newFixedThreadPool(2);		
		
		// This is the countDown Runnable that each thread from the ExecutorService will run.
        Runnable countDown = new Runnable() {
            public void run() {                
                String threadName = Thread.currentThread().getName();                
                for (int i = 5; i >= 0; i--) {         
                    System.out.printf("%s: %d\n", threadName, i);
                    }                
            }
        };
        
        for (int i = 0; i < 10; i++) {
        	threadPool.execute(countDown);
		}
		
		// The executors have to be shut down or the threads will keep running.
		threadPool.shutdown();
		

	}

}
