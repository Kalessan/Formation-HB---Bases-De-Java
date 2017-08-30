package com.cgi.training.java.oop;

public class StaticMain {

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		staticDemo.doSomething();
		
		// Pas besoin de créer un objet pour appeller une méthode statique. N'est en revanche pas appellée au travers d'une instance.
		StaticDemo.doSomethingStatic(); 
	}

}
