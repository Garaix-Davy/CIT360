package edu.garaix.servlet.service;

public class LoginService {

	public boolean authenticate(String userID, String password) {
		// Dummy implementation. It would connect to a database in reality.
		
		if (password == null || password.trim() == "") {
			return false;
		} else {
			return true;
		}
		
	}
	
}
