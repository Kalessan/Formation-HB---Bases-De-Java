package com.cgi.training.java.oop;

public class StaticDemo {
	private String txt = "doSomething";
	private static String txtStatic = "doSomethingStatic";

	public static void doSomethingStatic() {
		System.out.println(txtStatic);
	}
	
	public void doSomething() {
		System.out.println(txt);
	}
}
