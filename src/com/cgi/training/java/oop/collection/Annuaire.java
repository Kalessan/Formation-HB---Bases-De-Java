package com.cgi.training.java.oop.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Annuaire {
	private ArrayList persons = new ArrayList();
	
	public void add(Person p) {
		persons.add(p);
	}
	
	public List getAllPersons() {
		return persons;
	}

}
