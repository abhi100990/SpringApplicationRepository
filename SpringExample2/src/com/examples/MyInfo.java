package com.examples;

public class MyInfo implements Info{

	private String infoMessage;
	
	/*public MyInfo(String infoMessage)
	{
		infoMessage = this.infoMessage;
	}*/
	
	public String getInfoMessage() {
		return infoMessage;
	}

	public void setInfoMessage(String infoMessage) {
		this.infoMessage = infoMessage;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
		System.out.println(getInfoMessage());
	}

}
