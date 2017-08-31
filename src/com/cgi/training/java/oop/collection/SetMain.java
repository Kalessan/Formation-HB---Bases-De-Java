package com.cgi.training.java.oop.collection;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<Integer> ints = new HashSet<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		if(! ints.add(1)) {
			System.out.println("oups");
		}
		System.out.println(ints);
		for(Integer e : ints) {
			System.out.println(e);
		}
	}

}
