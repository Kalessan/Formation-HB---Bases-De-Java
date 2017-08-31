package com.cgi.training.java.oop.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();		// => <> : operateur diamant, pas besoin de répeter integer => inférence de type
		ints.add(new Integer(42));
		ints.add(1);
		ints.add(100);
		ints.add(100);
		ints.add(100);
		
		ints.remove(2);
		
		System.out.println(ints);
		System.out.println(ints.isEmpty());
		
		for (int i = 0; i < ints.size(); i++) {
			System.out.println(ints.get(i));			
		}
		
		for (Integer currentElement : ints) {
			System.out.println(currentElement);			
		}
		
		
	}

}
