package com.cgi.training.java.oop;

public class CaesarCrypter {

	public String encrypt(String motACrypter, int n) {
		String motCrypte = "";
		int indiceDeA = 'a';
		
		for(int i = 0; i < motACrypter.length(); i++) {
			char currentChar = motACrypter.charAt(i);
			if((currentChar <= 'z' && currentChar >= 'a') 
			|| (currentChar <= 'Z' && currentChar >= 'A')) { // Pour ne prendre en compte que les lettres de l'alphabet
				int indiceLettreCryptee = indiceDeA + ((currentChar + n) - indiceDeA) % 26;
				motCrypte += (char) indiceLettreCryptee;
			} else {
				motCrypte += (char) currentChar;
			}
		}
		
		return motCrypte;
	}

}
