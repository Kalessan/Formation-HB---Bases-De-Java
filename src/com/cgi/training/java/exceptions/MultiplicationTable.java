package com.cgi.training.java.exceptions;

public class MultiplicationTable {

	/**
	 * Computes the multiplication table (up to 10) of a given number.
	 * @param n
	 * @throws Exception if n < 1 or n > 10
	 */
	public void printMultiplicationTable(int n) throws Exception {
		if(n > 10 || n < 1) {
			throw new Exception("n not between 1 and 10: " + n);
		}
		for(int i = 0; i < 11; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
