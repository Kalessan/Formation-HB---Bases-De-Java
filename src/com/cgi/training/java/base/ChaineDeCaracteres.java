package com.cgi.training.java.base;

public class ChaineDeCaracteres {

	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(s);
		
		int length = s.length();
		System.out.println(length);
		
		char charAtPositionOne = s.charAt(1);
		System.out.println(charAtPositionOne);
		
		boolean isEmpty = s.isEmpty();
		System.out.println(isEmpty);		
	}

}
