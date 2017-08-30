package com.cgi.training.java.oop;

public class Dog extends Animal {
	@Override	//override une méthode de même nom et même paramètres
	public String makeSomeNoise() {
		//return super.makeSomeNoise();
		return "wooof";
	}
}
