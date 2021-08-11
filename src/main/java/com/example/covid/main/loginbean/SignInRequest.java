package com.example.covid.main.loginbean;

public class SignInRequest {
	String userName;
	String password;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SignInRequest [userName=" + userName + ", password=" + password + "]";
	}

	public SignInRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public SignInRequest() {
		super();
	}
}