package com.cgi.training.java.oop;
/**
 * Représente un liste de tâches à faire. Chaque
 * élément de la liste est représenté sous le forme
 * de chaine de caractères.
 * 
 * @author Simon Gosselin
 *
 */
public class TodoListWithArrayCopy {
	private int currentPosition = 0;
	private String[] todos = new String[3];

	/**
	 * Ajoute un nouvel élément dans la todolist.
	 * @param t l'élément à ajouter à la todolist.
	 */
	public void add(String t) {
		if(currentPosition == todos.length) {
			augmentCapacity(3);
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
//		for (int i = 0; i < todos.length; i++) {
//			tmpTodos[i] = todos[i];
//		}	
		System.arraycopy(todos, 0, tmpTodos, 0, todos.length);
		todos = tmpTodos;	
	}

	/**
	 * Affiche la sortie standard.
	 */
	public void printTodos() {
		// Bonus Design =====================================================
		
		//Calcul de la plus grande chaine de caractères
		int max = todos[0].length();
		for (int i = 0; i < todos.length; i++) {
			if (todos[i].length() > max) {
				max = todos[i].length();
			}
		}
	
		// Construction de la bordure du haut
		String bordureHautGauche = "";
		String bordureHautDroite = "";
		for (int i = 0; i < (max/2)+1; i++) {
			bordureHautGauche += "=";
			bordureHautDroite = bordureHautGauche;
		}
		if(max % 2 != 0) {
			bordureHautDroite = bordureHautGauche + "=";
		}		
		System.out.println(bordureHautGauche + "ToDo List" + bordureHautDroite);
		
		// Ecriture des tâches et construction des bordures de droite 
		String bordureDroite = "  ||";
		for (int i = 0; i < todos.length; i++) {
			String espacement = "";
			for (int j = 0; j < (max - todos[i].length()) ; j++) {
				espacement += " ";
			}			
			System.out.println("||  " + (i+1) + ". " + todos[i] + espacement + bordureDroite);
		}
		
		// Construction de la bordure du Bas
		System.out.println(bordureHautGauche + "=========" + bordureHautDroite);

	}

}
