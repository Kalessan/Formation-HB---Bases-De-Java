package com.cgi.training.java.oop.rockpapperscissor;

import java.util.Random;
import java.util.Scanner;

public class RockPapperScissorV2 {

	public static void main(String[] args) {
		int rock = 0;
		int paper = 1;
		int scissors = 2;

		int playerPoints = 0;
		int cpuPoints = 0;

		// un truc qui s'appelle a peu pr�s shifumi

		// tant que personne n'a atteint 10 points
		// faire jouer l'ordinateur
		Random random = new Random();
		// g�n�rer un entier al�atoire entre 0 et 2 (inclus)
		// stocker l'entier g�n�r� dans une variable cpuChoice
		int cpuChoice = random.nextInt(3);

		// faire jouer le joueur
		// proposer les choix au joueur
		System.out.println("Saisir choix: 0: Rock  1: Paper 2: Scissors");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		// r�cup�rer la r�ponse du joueur dans une variable enti�re choixJOUEUR
		int playerChoice = -1;
		switch (input) {
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
			// TODO a g�rer...
		}

		// trouver le vainqueur par rapport aux r�gles du jeu
		// assigner un point au vainqueur
		if (playerChoice == cpuChoice) {
			// draw
			System.out.println("Draw !");
		} else if ((playerChoice == rock && cpuChoice == scissors) || (playerChoice == paper && cpuChoice == rock)
				|| (playerChoice == scissors && cpuChoice == paper)) {
			// player wins
			System.out.println("You won!");
			playerPoints++;
		} else {
			// cpu wins
			System.out.println("You loose!");
			cpuPoints++;
		}

	}
	
}