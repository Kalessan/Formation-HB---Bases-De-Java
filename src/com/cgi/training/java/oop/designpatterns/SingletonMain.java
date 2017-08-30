package com.cgi.training.java.oop.designpatterns;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
				
		// s1 == s2 // TRUE
	}

}
