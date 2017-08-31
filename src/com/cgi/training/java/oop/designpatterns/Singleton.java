package com.cgi.training.java.oop.designpatterns;

// Design pattern permettant d'emp�cher la cr�ation de plus d'une instance d'un objet
public class Singleton {
	private static Singleton instance;
	private Singleton() { // Constructeur en PRIVE
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return new Singleton();
	}
}
