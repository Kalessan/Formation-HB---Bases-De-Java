package com.cgi.training.java.oop;

public class StaticMain {

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		staticDemo.doSomething();
		
		// Pas besoin de cr�er un objet pour appeller une m�thode statique. N'est en revanche pas appell�e au travers d'une instance.
		StaticDemo.doSomethingStatic(); 
	}

}
