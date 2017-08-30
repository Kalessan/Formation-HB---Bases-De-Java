package com.cgi.training.java.oop;

public enum Color {
	RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

	private String hex;

	private Color(String hex) {
		this.hex = hex;
	}
	
	public String getHex() {
		return hex;
	}
	
}
