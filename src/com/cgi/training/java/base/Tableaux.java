package com.cgi.training.java.base;

public class Tableaux {

	public static void main(String[] args) {

		int a = 32;		// un seul entier
		
		int[] entiers = new int[10];	// un tableau d'entiers = taille fixe, type de contenu fixe.
	// type [taille] nom
		
		System.out.println(entiers);
		System.out.println(entiers[0]);
		System.out.println(entiers[1]);
		System.out.println(entiers[9]);
		
		System.out.println(entiers[2]);
		entiers[2] = 42;
		System.out.println(entiers[2]);
		
		System.out.println(entiers.length);
		
		char[] caracteres = new char[5];
		
		caracteres[0] = 'a';
		caracteres[1] = 'b';
		caracteres[2] = 'c';
		caracteres[3] = 'd';
		caracteres[4] = 'e';
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
		
	}

}
