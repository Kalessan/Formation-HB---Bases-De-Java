package com.cgi.training.java.oop;

public abstract class Animal { // = Classe mère (1 seule par sous classe). // Abstract empèche d'instancier une classe
	// les sous classes peuvent hérité des variables d'instance, des métodes, mais pas des constructeurs.
	protected String defaultNoise = "...";
	
	public abstract String makeSomeNoise();

	public void move() {
		// TODO move
	}
}
