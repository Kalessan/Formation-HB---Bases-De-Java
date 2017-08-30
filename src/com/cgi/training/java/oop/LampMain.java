package com.cgi.training.java.oop;

public class LampMain {

	public static void main(String[] args) {
		// Création d'un objet Lamp
		Lamp myLamp1 = new Lamp();		
		System.out.println(myLamp1);
		System.out.println("etat lampe1 : " + myLamp1.getIsOn());
		myLamp1.setIsOn(true);
		myLamp1.setBrand("Une Super Marque!");
		System.out.println("etat lampe1 : " + myLamp1.getIsOn());
		System.out.println("marque lampe1 : " + myLamp1.getBrand());
		
		Lamp myLamp2 = new Lamp();
		System.out.println(myLamp2);
		System.out.println("etat lampe2 : " + myLamp2.getIsOn());
	}

}
