package com.cgi.training.java.oop;

import java.util.Scanner;

public class TodoListMainV2 {

	/**
	 * Faire �voluer le programme en rajoutant un menu
	 * "Choisir une action:"
	 * " 1. Saisir une nouvelle t�che"
	 * " 2. Afficher la liste des t�ches"
	 * " 3. Quitter le programme"
	 */
	public static void main(String[] args) {
		TodoListV2 todoList = new TodoListV2();		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(true) {
			TodoListV2.menu(); // Appelle la m�thode pour afficher le menu
			input = scanner.nextLine();

			if(input.equals("1")) {	// Compare les caract�res des chaines de caract�res
				System.out.println("Entrer la t�che � ajouter:");
				input = scanner.nextLine();
				todoList.add(input);
			} else if(input.equals("2")) {
				todoList.printTodos();
				System.out.println("Appuyer sur une touche pour continuer");
				input = scanner.nextLine();
			} else if(input.equals("3")) {
				System.out.println("Fermeture du programe...");
				System.exit(0);
			} else {
				System.out.println("Commande non reconnue");
				System.out.println("Appuyer sur une touche pour continuer");
				input = scanner.nextLine();
			}
			
			/**
			 * Autre m�thode:
			 * switch(input) {
			 * case "1":
			 * 		do something
			 * 		break;
			 * case "2":
			 * 		do something
			 * 		break;
			 * case "3":
			 * 		do something
			 * 		break;
			 * default:
			 * 
			 * }
			 */
		}

	}

}
