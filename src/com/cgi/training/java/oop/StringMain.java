package com.cgi.training.java.oop;

public class StringMain {
	public static void Main(String[] args) {
		String s1 = "bonjour";
		String s2 = new String("bonjour");
		String s3 = new String("bonjour");
		String s4 = s2;
		
		System.out.println("s2 == s3 " + (s2 == s3));	// Compare références
		System.out.println("s2.equals(s3) " + s2.equals(s3));
		
		System.out.println("s2 == s3" + (s2 == s4));
		
		System.out.println("s1 == s5");
	}
		
}
		
