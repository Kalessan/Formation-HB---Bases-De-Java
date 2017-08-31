package com.cgi.training.java.oop.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(145,  "BOB");
		map.put(90, "ALFRED");
		
		System.out.println(map.get(145));;
		System.out.println(map.get(90));
		
		List<String> laFermeAuxAnimaux = new ArrayList<>();
		laFermeAuxAnimaux.add("mouton");
		laFermeAuxAnimaux.add("poule");
		laFermeAuxAnimaux.add("coq");
		laFermeAuxAnimaux.add("poussin");
		laFermeAuxAnimaux.add("mouton");
		laFermeAuxAnimaux.add("poule");
		laFermeAuxAnimaux.add("coq");
		laFermeAuxAnimaux.add("poussin");
		laFermeAuxAnimaux.add("mouton");
		laFermeAuxAnimaux.add("poule");
		laFermeAuxAnimaux.add("coq");
		laFermeAuxAnimaux.add("poussin");
		laFermeAuxAnimaux.add("mouton"); 
		laFermeAuxAnimaux.add("poule");
		laFermeAuxAnimaux.add("coq");
		laFermeAuxAnimaux.add("poussin");
		laFermeAuxAnimaux.add("mouton");
		laFermeAuxAnimaux.add("poule");
		laFermeAuxAnimaux.add("coq");
		laFermeAuxAnimaux.add("mouton");
		
		Map<String, Integer> totalPerAnimal = new HashMap<>();
		for(String nomAnimal : laFermeAuxAnimaux) {
			if(! totalPerAnimal.containsKey(nomAnimal)) {
				totalPerAnimal.put(nomAnimal, 0);
			}
			totalPerAnimal.put(nomAnimal, totalPerAnimal.get(nomAnimal) + 1);
		}
		System.out.println(totalPerAnimal);
		System.out.println(totalPerAnimal);
	}

}
