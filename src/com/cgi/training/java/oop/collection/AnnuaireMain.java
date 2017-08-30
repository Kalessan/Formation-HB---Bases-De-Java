package com.cgi.training.java.oop.collection;

import java.util.List;

public class AnnuaireMain {

	public static void main(String[] args) {
		Person p1 = new Person("Captain", "Flame");
		Person p2 = new Person("Al", "Bator");
	
		Annuaire annuaire = new Annuaire();
		annuaire.add(p1);
		annuaire.add(p2);
		
		List persons = annuaire.getAllPersons();
	}
	

}
