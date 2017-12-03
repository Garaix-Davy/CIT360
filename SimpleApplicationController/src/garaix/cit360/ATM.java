package garaix.cit360;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Controller bank = new Controller();
		double balance = (int)((Math.random() * 1000) + 100);
		double amount;
		String request;
		
		System.out.println("ATM: Welcome.");
		System.out.println("What would you like to do?");
		System.out.println("BALANCE | WITHDRAW | DEPOSIT | QUIT");
		
		request = input.nextLine();
		
		while (request != "QUIT") {
			
			switch(request) {
			
				case "BALANCE":
					balance = bank.handleRequest(request, balance, 0);
					break;
					
				case "WITHDRAW": case "DEPOSIT":
					System.out.println("Please enter the amount");
					amount = Integer.parseInt(input.nextLine());
					balance = bank.handleRequest(request, balance, amount);
					break;
				
				default: 
					System.out.println("Please enter a valid option.");
					break;			
			}
			
			System.out.println("BALANCE | WITHDRAW | DEPOSIT | QUIT");				
			request = input.nextLine();
		}
		
		System.out.println("Thank you for your business. Goodbye.");
	}

}
