package com.cgi.training.java.oop;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SquareMain {

	public static void main(String[] args) {

		Square square = new Square(10,20,30);
		System.out.println("x: " + square.getX() + " y: " + square.getY());
		System.out.println("Area: " + square.getArea());
		square.setX(0);
		square.setY(0);
		square.setWidth(0);
		System.out.println("x: " + square.getX() + " y: " + square.getY());
		System.out.println("Area: " + square.getArea());
		
	}

}
