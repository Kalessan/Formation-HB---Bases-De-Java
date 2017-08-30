package com.cgi.training.java.oop;

public class ShapeMain {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Rectangle(0, 0, 10, 20);
		shapes[1] = new Square(0, 0, 15);
		shapes[2] = new Circle(0, 0, 30);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
		
		Shape s1 = new Rectangle(0, 0, 100, 200);
		Shape s2 = new Square(0, 0, 150);
		
		

	}

}
