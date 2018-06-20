package com.ahmed;

public class Authentication {
	
	public boolean isUserValid(String email, String password) {
		return email.equalsIgnoreCase("ahmed.mirza994@gmail.com") && password.equals("ahmed");
	}
	
}
