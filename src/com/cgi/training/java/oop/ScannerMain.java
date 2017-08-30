package com.cgi.training.java.oop;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		String test = "100 2 3 4 5 6 7 8";
		
		Scanner scanner = new Scanner(test);
		while(scanner.hasNextInt()){
			System.out.println(scanner.nextInt());			
		}
		
		Scanner scannerStdIn = new Scanner(System.in);
		while(true) {
			String input = scannerStdIn.nextLine();
			System.out.println(input);
		}


	}

}
