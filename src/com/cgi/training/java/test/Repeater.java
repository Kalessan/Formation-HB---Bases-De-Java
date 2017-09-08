package com.cgi.training.java.test;

import java.util.Objects;

public class Repeater {	
	
	/**
	 * Repeat n times the input
	 * @param input
	 * @param times a positive integer
	 * @return the input repeated n times, if input is empty or if n == 0, return an empty string
	 * @throws NullPointerException if input is null
	 * @throws IllegalArgumentException if n is negative
	 */
	public String repeat(String input, int n) {
		Objects.requireNonNull(input, "input must not be null");
//			=> Remplace:
//			if(input == null) {
//				throw new NullPointerException("input must not be bull");			
//			}
		
		if(input.isEmpty()) {
			return "";
		}
		
		if(n < 0) {
			throw new IllegalArgumentException("n must not be negative");
		}
		
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < n; i++) {
			sb.append(input);
		}
		return sb.toString();
	}

}
