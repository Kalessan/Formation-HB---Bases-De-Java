package com.cgi.training.java.base;

public class FeuTricoloreEnModeConsole {

	public static void main(String[] args) throws InterruptedException {
		// Ecrire un programme qui affiche
		//"rouge" ... "vert" ... "orange" ... "rouge" ...
		// Les ... correspondent à un temps d'attente d'1/2 seconde
		
		//Pour attendre 1 seconde: Thread.sleep(1000)		
		//System.out.println("hello");
		//Thread.sleep(1000);
		//System.out.println("world");

		//for (;;) {
		//System.out.println("Rouge");
		//Thread.sleep(500);
		//System.out.println("Vert");
		//Thread.sleep(500);
		//System.out.println("Orange");
		//Thread.sleep(500);
		//}
		
		// V2
		// avec une variable qui correspond à l'état du feu (vert, orange, rouge)
		String couleurFeu = "rouge";
		while(true) {
			if(couleurFeu == "rouge") {
				couleurFeu = "vert";
			} else if(couleurFeu == "vert") {
				couleurFeu = "orange";
			} else {
				couleurFeu = "rouge";
			}
			System.out.println(couleurFeu);
			Thread.sleep(500);
		}
		
	}
	
}
