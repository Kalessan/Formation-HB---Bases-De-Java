package com.cgi.training.java.oop;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.makeSomeNoise());
		
		Cat cat = new Cat();
		System.out.println(cat.makeSomeNoise());
		
		Animal x = new Dog();
		System.out.println(x.makeSomeNoise());

	}

}
