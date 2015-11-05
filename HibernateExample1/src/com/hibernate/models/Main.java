package com.hibernate.models;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		
		factory.openSession();
		
		Employee emp = new Employee();
		emp.setName("Abhishek");
		emp.setEmail("abhi10901@gmail.com");
		emp.setPhone("5104936205");
		emp.setSalary("90000");
		
		factory.close();
	}

}
