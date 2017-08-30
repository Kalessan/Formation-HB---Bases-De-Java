//package com.cgi.training.java.oop.rockpapperscissor;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class RockPapperScissorsGame { // Controller => coordinate everything
//	
//	public void play() {
//		CPU cpu = new CPU();
//		int cpuChoice = cpu.playAction();
//		
//
//		// faire jouer le joueur
//		// proposer les choix au joueur
//		System.out.println("Saisir choix: 0: Rock  1: Paper 2: Scissors");
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//
//		// récupérer la réponse du joueur dans une variable entière choixJOUEUR
//		int playerChoice = -1;
//		switch (input) {
//		case "0":
//			playerChoice = rock;
//			break;
//		case "1":
//			playerChoice = paper;
//			break;
//		case "2":
//			playerChoice = scissors;
//			break;
//		default:
//			// TODO a gérer...
//		}
//
//		// trouver le vainqueur par rapport aux règles du jeu
//		// assigner un point au vainqueur
//		if (playerChoice == cpuChoice) {
//			// draw
//			System.out.println("Draw !");
//		} else if ((playerChoice == rock && cpuChoice == scissors) || (playerChoice == paper && cpuChoice == rock)
//				|| (playerChoice == scissors && cpuChoice == paper)) {
//			// player wins
//			System.out.println("You won!");
//			playerPoints++;
//		} else {
//			// cpu wins
//			System.out.println("You loose!");
//			cpuPoints++;
//		}
//
//	}
//	}
//}
