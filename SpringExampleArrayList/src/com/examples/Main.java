package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		UserListSpring listSpring = (UserListSpring) context.getBean("userListSpring");
		
		System.out.println(listSpring.getUserList());
	}
}
