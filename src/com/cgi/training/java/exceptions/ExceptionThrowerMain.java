package com.cgi.training.java.exceptions;

public class ExceptionThrowerMain {

	public static void main(String[] args) {
		ExceptionThrower et = new ExceptionThrower();
		
		try {	// Teste les exceptions
			et.throwAnException();
		} catch (Exception e) {	// Attrape et g�re les exceptions
			e.printStackTrace();
		}
		
		System.out.println("The End");

	}

}
