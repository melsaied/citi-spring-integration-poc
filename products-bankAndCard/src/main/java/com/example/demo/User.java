package com.example.demo;

public class User {
	private String userID;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", password=" + password + "]";
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
