package com.cgi.training.java.oop;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	// First Name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	// Last Name
	public String getLastName() {
		return lastName;
	}
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	// Age
	public int getAge() {
		return age;
	}
	public void setAge (int age) {
		this.age = age;
	}
}
