package com.in28minutes.login;

public class LoginService {
	public boolean isUserValid(String user, String password) {
		if(user.equals("Sarthak!")&&password.equals("bb")) {
			return true;
		}
		else {
			return false;
		}
	}
}