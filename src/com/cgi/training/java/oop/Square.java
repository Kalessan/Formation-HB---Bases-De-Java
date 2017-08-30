package com.cgi.training.java.oop;

public class Square implements Shape {
	private double x;
	private double y;
	private double width;
	
	// Constructeur sans paramètres
	public Square() {
		this(20,20,40);
//		équivaut à:		
//		x = 20;
//		y = 20;
//		width = 40;
	}

	// Autre constructeur avec 3 paramètres
	// Polymorphisme de méthodes
	public Square(double x, double y, double width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return width * width;
	}
	
	
}
