package com.cgi.training.java.oop;

public class Dog extends Animal {
	@Override	//override une m�thode de m�me nom et m�me param�tres
	public String makeSomeNoise() {
		//return super.makeSomeNoise();
		return "wooof";
	}
}
