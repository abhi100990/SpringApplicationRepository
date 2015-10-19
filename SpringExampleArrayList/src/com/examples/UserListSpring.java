package com.examples;

import java.util.ArrayList;

public class UserListSpring {

	private ArrayList<String> userList;
	
	public UserListSpring()
	{
		this.userList = new ArrayList<String>();
	}

	public ArrayList<String> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<String> userList) {
		this.userList = userList;
	}
}
