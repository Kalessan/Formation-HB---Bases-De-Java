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

		// un truc qui s'appelle a peu près shifumi

		// tant que personne n'a atteint 10 points
		// faire jouer l'ordinateur
		Random random = new Random();
		// générer un entier aléatoire entre 0 et 2 (inclus)
		// stocker l'entier généré dans une variable cpuChoice
		int cpuChoice = random.nextInt(3);

		// faire jouer le joueur
		// proposer les choix au joueur
		System.out.println("Saisir choix: 0: Rock  1: Paper 2: Scissors");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		// récupérer la réponse du joueur dans une variable entière choixJOUEUR
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
			// TODO a gérer...
		}

		// trouver le vainqueur par rapport aux règles du jeu
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