package com.examples;

public class AbhiInfo implements Info{

	private String infoMessage;
	
	public AbhiInfo(String infoMessage)
	{
		this.infoMessage = infoMessage;
	}
	
	public String getInfoMessage() {
		return infoMessage;
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(getInfoMessage());
	}

}
