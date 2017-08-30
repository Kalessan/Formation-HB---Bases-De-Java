package com.cgi.training.java.oop;

public class NumberMain {

	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		System.out.println(i1.byteValue());
		
		Double d1 = new Double(1.0);
		System.out.println(d1.byteValue());
		
		Number n1 = i1;
		Number n2 = d1;
	}

}
