package garaix.cit360.simple;

import static garaix.cit360.simple.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println(ANSI_RED + "Hello from myRunnable's implementation of run()");
	}
	
}
