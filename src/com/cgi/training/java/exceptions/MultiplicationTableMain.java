package com.cgi.training.java.exceptions;

public class MultiplicationTableMain {

	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable();
		try {	// Teste les exceptions
			mt.printMultiplicationTable(5); // => pas d'exception
			mt.printMultiplicationTable(11);	// => exception
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END...");
	}

}
