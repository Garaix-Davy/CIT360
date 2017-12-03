package garaix.cit360;

public class Withdraw implements Banking {
	
	public double bank(double balance, double amount) {
		System.out.println("You have withdrawn $" + amount + ". Thank you.");
		return balance-amount;
	}

}
