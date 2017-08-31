package com.cgi.training.java.oop;

import java.util.ArrayList;

public class NumberMain {

	public static void main(String[] args) {
		int i = 3;	// Type primitif; operations se font par copie
		int j = i;
		i++;
		Integer i1 = new Integer(1);	// Type wrapper, objet dont une des variables d'instance sera une variable primitive (ici, int)
		System.out.println(i1.byteValue());
		
		Integer i2 = i;	// new integer(i) ==> Boxing
		int i3 = i2;	// i2.intValue();	==> Unboxing

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.parseInt("123"));	// ==> une chaine de caractère en entier
		
		double d = 2.0;
		Double d1 = new Double(1.0);
		System.out.println(d1.byteValue());
		
		Number n1 = i1;
		Number n2 = d1;
	}

}
