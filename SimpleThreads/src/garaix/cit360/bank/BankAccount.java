package garaix.cit360.bank;

public class BankAccount {
	
	private double balance;
	private String accountNumber;
	
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	// synchronized makes these methods thread safe.
	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println("Balance after deposit: " + this.balance);
	}
	
	public synchronized void withdraw(double amount) {
		balance -= amount;
		System.out.println("Balance after withdrawal: " + this.balance);
	}

	// This is another way of synchronizing the methods to keep them thread safe.
//	public void deposit(double amount) {
//		synchronized (this) {
//			balance += amount;
//		}
//		
//	}
//	
//	public void withdraw(double amount) {
//		synchronized (this) {
//			balance -= amount;
//		}
//		
//	}
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void printAccountNumber() {
		System.out.println("Account number = " + accountNumber);
	}

	@Override
	public String toString() {
		return "Account Number: " + this.accountNumber + "\tAccount Balance: " + this.balance;
	}
	
}
