package com.examples.models;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Student {

	@NotBlank(message = "Please enter student name")
	private String name;
	
	@Size(max = 13, min = 10, message="Mobile number must be of length between 10 and 13")
	private String mobile;
	
	private String email;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
