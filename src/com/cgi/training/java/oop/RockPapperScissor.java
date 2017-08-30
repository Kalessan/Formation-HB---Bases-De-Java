package com.cgi.training.java.oop;

import java.util.Random;
import java.util.Scanner;

public class RockPapperScissor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("How many points to win?");
		String input = scanner.nextLine();
		int pointsToWin = Integer.valueOf(input);
		
		//while(true) {
			int scoreCpu = 0;
			int scorePlayer = 0;
			while((scoreCpu < (pointsToWin) && scorePlayer < (pointsToWin))) {
				// Choix du joueur
				System.out.println("Choose between \"Rock\" (0), \"Papper\" (1) or \"Siccor\" (2):");
				int playerChoiceId = -1;
				input = scanner.nextLine();		
				if(input.equals("0") || input.equals("Rock")) {
					playerChoiceId = 0;
				} else if(input.equals("1") || input.equals("Papper")) {
					playerChoiceId = 1;
				} else if(input.equals("2") || input.equals("Scissor")) {
					playerChoiceId = 2;
				}			
				RockPapperScissorObject playerChoice = new RockPapperScissorObject();		
				playerChoice.setChoice(playerChoiceId);	
				System.out.println("You choose: " + playerChoice.getType());
				
				
				//Détermination aléatoire du choix de l'ordinateur.			 
				RockPapperScissorObject cpuChoice = new RockPapperScissorObject();
				Random random = new Random();
				int randomBetween0And2 = random.nextInt(3);
				cpuChoice.setChoice(randomBetween0And2);	
				System.out.println("Your opponent choose: " + cpuChoice.getType());
				
	
				//Détermination du gagnant.		
				String resultPlayer = "";
				if(! playerChoice.getType().equals("ERROR")) {
					if(playerChoice.getId() == cpuChoice.getId()) {
						resultPlayer = "draw";
					} else if (playerChoice.getId() == 0 && cpuChoice.getId() == 2) {
						resultPlayer = "victory";
					} else if (playerChoice.getId() == 2 && cpuChoice.getId() == 0) {
						resultPlayer = "defeat";
					} else {
						if(playerChoice.getId() < cpuChoice.getId()) {
							resultPlayer = "defeat";
						} else {
							resultPlayer = "victory";
						}
					}
				} else {
					
				}
				
				// Calcul des scores
				if(resultPlayer == "draw") {
					System.out.println("[ DRAW! ]");
				} else if(resultPlayer == "victory") {
					System.out.println("[ You won! ]");
					scorePlayer++;
				} else if(resultPlayer == "defeat") {
					System.out.println("[ You lost! ]");
					scoreCpu++;
				} else {
					System.out.println("Error: You didn't choose between Rock, Papper or Scissor.");
					System.out.println("Press a key to continue.");
					input = scanner.nextLine();	
				}
			
				System.out.println("Player: " + scorePlayer + " | CPU: " + scoreCpu);
				System.out.println("");				
			}
			System.out.println("Game Over");
		//}
	}	
}
