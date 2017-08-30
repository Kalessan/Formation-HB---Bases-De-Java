package com.cgi.training.java.oop;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		double randomBetween0And1 = Math.random();	// Double entre 0.0 (inclu)et 1.0 (exclu)
		
		Random random = new Random();
		int randomBetween0And10 = random.nextInt(10);	// int entre 0 et 10 (exclu)
		
	}

}
