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
				// D�s que 2 lettres de positions oppos�es sont diff�rentes, 
				// on en d�duit que ce n'est pas un palindrome, et on arr�te la boucle
				break;
			}
			i++;			
		}
		
		// Ecriture du r�sultat
		if(cEstUnPalindrome) {
			System.out.println("\"" + mot + "\" est un palindrome.");
		} else {
			System.out.println("\"" + mot + "\" n'est pas un palindrome.");
		}
	}
}
