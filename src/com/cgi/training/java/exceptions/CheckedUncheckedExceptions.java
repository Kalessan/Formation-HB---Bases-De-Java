package com.cgi.training.java.exceptions;

import java.sql.DriverManager;

public class CheckedUncheckedExceptions {

	public static void main(String[] args) {
		
		// Unchecked, rien à faire de spécial (sous-classes de RuntimeException)
		int a = (new int[0])[1];	// ArrayIndexOutOfBoundException => Unchecked exception
		Integer.parseInt("bonjour");	// NumberFormatException => Unchecked exception
		
		// Ne compile pas sans Catch or Specify
		//DriverManager.getConnection("plop");	// SQLException => Checked exception
		//Thread.sleep(100);	// InterruptedException = > Checked exception
		
		// Pas besoin de gérer explicitement les unchecked
		// Besoin de gérer explicitement les checked => Try/Catch

	}

}
