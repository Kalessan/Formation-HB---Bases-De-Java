package com.cgi.training.java.base;

public class TriTableaux {

	public static void main(String[] args) {
		int[] arrUnsorted = new int[5];
		arrUnsorted[0] = 10;
		arrUnsorted[1] = 5;
		arrUnsorted[2] = 10;
		arrUnsorted[3] = -8;
		arrUnsorted[4] = 90;
		
		int[] arrSorted = new int[arrUnsorted.length];
		
		int numberOfItemsToSort  = arrUnsorted.length;
		
		for (int j = 0; j < numberOfItemsToSort; j++) {
			// Trouver le minimum
			int min = arrUnsorted[0];
			int minPosition = 0;
			
			for (int i = 0; i < arrUnsorted.length; i++) {				
				// Mettre à jour e minimum
				if(arrUnsorted[i] < min) {
					min = arrUnsorted[i];
					minPosition = i;
				}
			}
			// Ajouter le minimum dans le tableau
			arrSorted[j] = min;
			
			// Retirer les minimum dans le tableau trié
			int[] tmpArrUnsorted = new int[arrUnsorted.length - 1];
			boolean minFound = false; // Eviter les doublon
			for (int i = 0, tmpI = 0; i < arrUnsorted.length; i++) {
				if(i != minPosition) {
					tmpArrUnsorted[tmpI] = arrUnsorted[i];
					tmpI++;
				} else {
					minFound = true;
				}
			}
			arrUnsorted = tmpArrUnsorted;
		}
		for (int i = 0; i < arrSorted.length; i++) {
			System.out.println(arrSorted[i]);
		}
	}
}