package com.cgi.training.java.exceptions;

import java.sql.DriverManager;

public class CheckedUncheckedExceptions {

	public static void main(String[] args) {
		
		// Unchecked, rien � faire de sp�cial (sous-classes de RuntimeException)
		int a = (new int[0])[1];	// ArrayIndexOutOfBoundException => Unchecked exception
		Integer.parseInt("bonjour");	// NumberFormatException => Unchecked exception
		
		// Ne compile pas sans Catch or Specify
		//DriverManager.getConnection("plop");	// SQLException => Checked exception
		//Thread.sleep(100);	// InterruptedException = > Checked exception
		
		// Pas besoin de g�rer explicitement les unchecked
		// Besoin de g�rer explicitement les checked => Try/Catch

	}

}
