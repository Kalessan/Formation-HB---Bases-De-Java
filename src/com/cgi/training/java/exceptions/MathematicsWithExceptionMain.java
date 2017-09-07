package com.cgi.training.java.exceptions;

public class MathematicsWithExceptionMain {
	public static void main(String[] args) throws Exception {		
		System.out.println(MathematicsWithException.addition(1, 1));
		System.out.println(MathematicsWithException.addition(Integer.MAX_VALUE, 1));
		System.out.println(MathematicsWithException.addition(Integer.MIN_VALUE, -1));
	}

}


