package com.cgi.training.java.base;

public class Palindrome {

	public static void main(String[] args) {		
		String mot = "radar";
		int length = mot.length() - 1;
		int i = 0;
		boolean cEstUnPalindrome = true;
		
		// Comparaison des lettres
		while(i <= (length / 2)) {			
			if((mot.charAt(i)) != (mot.charAt(length - i))) {
				cEstUnPalindrome = false;
				// Dès que 2 lettres de positions opposées sont différentes, 
				// on en déduit que ce n'est pas un palindrome, et on arrête la boucle
				break;
			}
			i++;			
		}
		
		// Ecriture du résultat
		if(cEstUnPalindrome) {
			System.out.println("\"" + mot + "\" est un palindrome.");
		} else {
			System.out.println("\"" + mot + "\" n'est pas un palindrome.");
		}
	}
}
