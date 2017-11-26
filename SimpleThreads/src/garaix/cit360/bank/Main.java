package garaix.cit360.bank;

public class Main {

	public static void main(String[] args) {
		final BankAccount account = new BankAccount("1234-5678-1234-5678", 1000.00);
		System.out.println(account.toString());
		
		// These are anonymous threads
//		Thread trThread1 = new Thread() {
//			public void run() {
//				System.out.println(account.toString());
//				account.deposit(150.00);
//				account.withdraw(25.00);
//				System.out.println(account.toString());
//			}
//		};
//		
//		Thread trThread2 = new Thread() {
//			public void run() {
//				System.out.println(account.toString());
//				account.deposit(225.25);
//				account.withdraw(75.75);
//				System.out.println(account.toString());
//			}
//		};
		
		// These are threads creating runnables
		Thread trThread1 = new Thread(new Runnable() {
			@Override
			public void run() {				
				account.deposit(150);
				account.withdraw(25);
			}
		});

		Thread trThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				account.deposit(225);
				account.withdraw(75.75);
			}
		});		
		
		
		trThread1.start();
		trThread2.start();
		
	}

}
