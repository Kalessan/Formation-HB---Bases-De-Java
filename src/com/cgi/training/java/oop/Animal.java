package com.cgi.training.java.oop;

public abstract class Animal { // = Classe m�re (1 seule par sous classe). // Abstract emp�che d'instancier une classe
	// les sous classes peuvent h�rit� des variables d'instance, des m�todes, mais pas des constructeurs.
	protected String defaultNoise = "...";
	
	public abstract String makeSomeNoise();

	public void move() {
		// TODO move
	}
}
