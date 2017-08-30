package com.cgi.training.java.oop.rockpapperscissor;

import java.util.Random;

public class CPU {
	private int score = 0;
	
	public int getScore() {
		return score;
	}
	
	public int playAction() {
		Random random = new Random();
		return random.nextInt(3);
	}

	public void increaseScore() {
		score++;
	}
}
