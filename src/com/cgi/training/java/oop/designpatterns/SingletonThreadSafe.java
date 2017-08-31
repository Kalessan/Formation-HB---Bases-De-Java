package com.cgi.training.java.oop.designpatterns;

// Idem que singleton, mais marche avec le multithreading
public class SingletonThreadSafe {
	private static SingletonThreadSafe instance = new SingletonThreadSafe();
	
	private SingletonThreadSafe() { // Constructeur en PRIVE
	}
	
	public static SingletonThreadSafe getInstance() {
		return instance;
	}
}
