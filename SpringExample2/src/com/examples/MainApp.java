package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		//UserDetails details = new UserDetails();
		//details.getUserDetails();
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
		
		UserDetails details = (UserDetails) context.getBean("userDetails");
		
		details.getUserDetails();
		
		UserDetails abhiDetails = (UserDetails) context.getBean("abhiDetails");
		
		abhiDetails.getUserDetails();
	}
}
