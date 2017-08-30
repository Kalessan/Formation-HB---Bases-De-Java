package com.cgi.training.java.oop;
/**
 * Représente un liste de tâches à faire. Chaque
 * élément de la liste est représenté sous le forme
 * de chaine de caractères.
 * 
 * @author Simon Gosselin
 *
 */
public class TodoListV2 {
	private int currentPosition = 0;
	private String[] todos = new String[3];

	/**
	 * Ajoute un nouvel élément dans la todolist.
	 * @param t l'élément à ajouter à la todolist.
	 */
	public void add(String t) {
		if(currentPosition == todos.length) {
			augmentCapacity(1);
		}
		todos[currentPosition] = t;
		currentPosition++;		
	}

	/**
	 * Augmente la capacité interne de la todolist d'un certain
	 * nombre d'éléments.
	 * @param n le nombre d'éléments à rajouter à la capacité de la todolist.
	 */
	private void augmentCapacity(int n) {
		String[] tmpTodos = new String[todos.length + n];		
		for (int i = 0; i < todos.length; i++) {
			tmpTodos[i] = todos[i];
		}
	
		todos = tmpTodos;	
	}

	/**
	 * Affiche la sortie standard.
	 */
	public void printTodos() {		
		for (int i = 0; i < todos.length; i++) {
			System.out.println((i + 1) + ". " + todos[i]);
		}
	}
	
	/**
	 * Affiche le menu, détaillant les commandes disponiblez.
	 */
	public static void menu() {
		System.out.println(" ");
		System.out.println("Choisir une action (Entrer le numéro correspondant):");
		System.out.println(" 1. Saisir une nouvelle tâche");
		System.out.println(" 2. Afficher la liste des tâches");
		System.out.println(" 3. Quitter le programme");
	}
}


