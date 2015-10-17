package com.examples;

public class UserDetails {

	private Info info;
	
	public UserDetails()
	{
		info = new MyInfo("This is my info.");
	}
	
	public void getUserDetails()
	{
		info.getInfo();
	}
}
