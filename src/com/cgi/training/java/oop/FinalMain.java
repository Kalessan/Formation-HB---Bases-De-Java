package com.cgi.training.java.oop;

public class FinalMain {

	public static void main(String[] args) {
		int a = 3;
		a = 4;
		
		final int b = 4;
	//	b = 42; <== Impossible, une variable "final" ne peut plus être modifiée
		
		final int c;
		c = 32;
	//	c = 5; <== La variable final se "bloque" à la première affectation
	}

}
