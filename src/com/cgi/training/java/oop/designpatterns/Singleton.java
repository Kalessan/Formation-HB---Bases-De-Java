package com.cgi.training.java.oop.designpatterns;

public class Singleton {
	private static Singleton instance;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return new Singleton();
	}
}
