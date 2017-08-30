package com.cgi.training.java.oop.rockpapperscissor;

import java.util.Random;
import java.util.Scanner;

public class HumanPlayer {

	private int score = 0;
	
	public int getScore() {
		return score;
	}
	
	public int playAction() {
		int rock = 0;
		int paper = 1;
		int scissors = 2;
		
		// faire jouer le joueur
		// proposer les choix au joueur
		System.out.println("Saisir choix: 0: Rock  1: Paper 2: Scissors");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		// récupérer la réponse du joueur dans une variable entière choixJOUEUR
		int playerChoice = -1;
		switch(input) {
		case "0":
			playerChoice = rock;
			break;
		case "1":
			playerChoice = paper;
			break;
		case "2":
			playerChoice = scissors;
			break;
		default:
			// TODO a gérer...
		}
		
		return playerChoice;
	}
	
	public void increaseScore() {
		score++;
	}
}
