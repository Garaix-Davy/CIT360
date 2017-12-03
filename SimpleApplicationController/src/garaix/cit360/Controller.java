package garaix.cit360;

import java.util.HashMap;

public class Controller {
	
	public static HashMap<String, Banking> map = new HashMap <String, Banking>();
	
	public void Controller() {
		
	}
	
	public double handleRequest(String request, double balance, double amount) {
		
		map.put("WITHDRAW", new Withdraw()); 
		map.put("DEPOSIT", new Deposit());
		map.put("BALANCE", new Balance());
		
		Banking handler = map.get(request);
		balance = handler.bank(balance, amount);
		
		return balance;
		
	}
	
}
