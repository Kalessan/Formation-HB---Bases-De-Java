package com.cgi.training.java.oop;
/**
 * Repr�sente un liste de t�ches � faire. Chaque
 * �l�ment de la liste est repr�sent� sous le forme
 * de chaine de caract�res.
 * 
 * @author Simon Gosselin
 *
 */
public class TodoListV2 {
	private int currentPosition = 0;
	private String[] todos = new String[3];

	/**
	 * Ajoute un nouvel �l�ment dans la todolist.
	 * @param t l'�l�ment � ajouter � la todolist.
	 */
	public void add(String t) {
		if(currentPosition == todos.length) {
			augmentCapacity(1);
		}
		todos[currentPosition] = t;
		currentPosition++;		
	}

	/**
	 * Augmente la capacit� interne de la todolist d'un certain
	 * nombre d'�l�ments.
	 * @param n le nombre d'�l�ments � rajouter � la capacit� de la todolist.
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
	 * Affiche le menu, d�taillant les commandes disponiblez.
	 */
	public static void menu() {
		System.out.println(" ");
		System.out.println("Choisir une action (Entrer le num�ro correspondant):");
		System.out.println(" 1. Saisir une nouvelle t�che");
		System.out.println(" 2. Afficher la liste des t�ches");
		System.out.println(" 3. Quitter le programme");
	}
}


