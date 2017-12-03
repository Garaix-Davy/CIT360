package garaix.cit360;

public class Deposit implements Banking{
	
	public double bank(double balance, double amount) {
		System.out.println("You have deposited $" + amount + ". Thank you.");
		return balance+amount;
	}
}
