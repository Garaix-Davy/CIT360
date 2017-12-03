package garaix.cit360;

public class Balance implements Banking{
	
	public double bank(double balance, double amount) {
		System.out.println("Your balance is $" + balance + ".");
		return balance;
	}	
	
}
