package com.cgi.training.java.oop;

public class Circle implements Shape{
	private double x;
	private double y;
	private double radius;
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
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

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
	//	return (radius * radius) * Math.PI;
		return Math.pow(radius, 2) * Math.PI;
	}

}
